package parsers.visitors

import models.aspect.Advice
import models.aspect.Aspect
import models.aspect.items.*
import models.aspect.pointcut.Pointcut
import models.boolExpr.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser
import kotlin.reflect.jvm.internal.impl.serialization.ProtoBuf


/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {
    var pointcutList: List<Pointcut>

    init {
        pointcutList = mutableListOf()
    }

    override fun visitAspectDeclaration(ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        val id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)

        pointcutList = pointcutVisitor.pointcuts

        val adviceVisitor = AdviceVisitor()
        adviceVisitor.visit(ctx)

        return Aspect(id, pointcutList, adviceVisitor.advices)
    }

    inner class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>() {
        var pointcuts = mutableListOf<Pointcut>()

        override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
            val boolExpr = buildExpression(ctx.pointcutExpression())
            pointcuts.add(Pointcut(ctx.id().text, boolExpr))
            return Pointcut("", NodeItem("", ""))
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            return expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            fun buildModifiersList(modifier: AspectGrammarParser.MethodModifiersPatternContext?): MutableList<MaybeNegativeParameter> {
                if (modifier == null)
                    return mutableListOf()
                if (modifier.methodModifiersPattern().isEmpty())
                    return mutableListOf(MaybeNegativeParameter(modifier.methodModifier().text, false))
                val retList = buildModifiersList(modifier.methodModifiersPattern().first())
                retList.add(MaybeNegativeParameter(modifier.methodModifier().text, false))
                return retList
            }

            fun fillMethod(methodPattern: AspectGrammarParser.MethodPatternContext): MethodPattern {
                var extensionModifier = ExtensionType.ANYTHING
                if (methodPattern.extensionModifier() != null) {
                    if (methodPattern.extensionModifier().children.first().text == "!") {
                        extensionModifier = ExtensionType.NOT_EXTENSION
                    } else {
                        extensionModifier = ExtensionType.EXTENSION
                    }
                }

                var inlineModifier = InlineType.ANYTHING
                if (methodPattern.inlineModifier() != null) {
                    if (methodPattern.inlineModifier().children.first().text == "!") {
                        inlineModifier = InlineType.NOT_INLINE
                    } else {
                        inlineModifier = InlineType.INLINE
                    }
                }

                val annotations = if (methodPattern.annotationPattern() == null) mutableListOf<MaybeNegativeParameter>() else methodPattern.annotationPattern().annotationTypePattern().map { MaybeNegativeParameter(it.text, false) }
                val modifiers = buildModifiersList(methodPattern.methodModifiersPattern())
                val type = if (methodPattern.typePattern() == null || methodPattern.typePattern().simpleTypePattern() == null)
                    MaybeNegativeParameter("", false)
                else
                    MaybeNegativeParameter(methodPattern.typePattern().simpleTypePattern().text, false)
                val name = MaybeNegativeParameter(methodPattern.simpleNamePattern().text, false)
                val params = if (methodPattern.formalParametersPattern().formalsPattern() == null) mutableListOf<MaybeNegativeParameter>() else methodPattern.formalParametersPattern().formalsPattern().children.map {
                    val parameter = (it as AspectGrammarParser.OptionalParensTypePatternContext).typePattern()

                    val negative = parameter.childCount == 2 && parameter.children[0].text == "!"

                    val typeNameNode =
                            if (parameter.children.first() is TerminalNodeImpl)
                                parameter.children.last() as ParserRuleContext
                            else
                                parameter
                    val typeName = typeNameNode.children.first().text
                    var nullableType = NullabilityType.ANYTHING
                    if (typeNameNode.childCount == 2) {
                        nullableType = if (typeNameNode.children[1].text == "?")
                            NullabilityType.NULLABLE
                        else
                            NullabilityType.NOT_NULL
                    }

                    MaybeNegativeParameter(typeName, negative, nullableType)
                }
                val retType = if (methodPattern.retTypePattern() == null)
                    null
                else {
                    val negative = methodPattern.retTypePattern().childCount == 2 && methodPattern.retTypePattern().children[0].text == "!"
                    val typeNameNode = methodPattern.retTypePattern().typePattern()
                    val typeName = typeNameNode.children.first().text
                    var nullableType = NullabilityType.ANYTHING
                    if (typeNameNode.childCount == 2) {
                        nullableType = if (typeNameNode.children[1].text == "?")
                            NullabilityType.NULLABLE
                        else
                            NullabilityType.NOT_NULL
                    }
                    MaybeNegativeParameter(typeName, negative, nullableType )
                }

                return MethodPattern(annotations, modifiers, type, name, params, retType, extensionModifier, inlineModifier)
            }

            if (pointcutExpression.childCount == 1) {
                if (pointcutExpression.getChild(0).childCount == 2)
                    return NodeItem(pointcutExpression.getChild(0).text, null)
                else {
                    if (pointcutExpression.pointcutPrimitive() is AspectGrammarParser.CallPointcutContext) {
                        val methodPattern = (pointcutExpression.pointcutPrimitive() as AspectGrammarParser.CallPointcutContext).methodOrConstructorPattern().methodPattern()
                        return CallNodeItem(fillMethod(methodPattern))
                    }
                    if (pointcutExpression.pointcutPrimitive() is AspectGrammarParser.ExecutionPointcutContext) {
                        val methodPattern = (pointcutExpression.pointcutPrimitive() as AspectGrammarParser.ExecutionPointcutContext).methodOrConstructorPattern().methodPattern()
                        return ExecutionNodeItem(fillMethod(methodPattern))
                    }
                    if (pointcutExpression.pointcutPrimitive() is AspectGrammarParser.TargetPointcutContext) {
                        val typeName =  (pointcutExpression.pointcutPrimitive() as AspectGrammarParser.TargetPointcutContext).typeOrIdentifier().typeType().text
                        return TargetNodeItem(MaybeNegativeParameter(typeName, false))
                    }
                    return NodeItem(pointcutExpression.getChild(0).getChild(2).text, pointcutExpression.getChild(0).getChild(0).text)
                }
            }

            if (pointcutExpression.childCount == 2) {
                val not = Not()
                not.setChild(expression(pointcutExpression.pointcutExpression(0)))
                return not
            }

            if (pointcutExpression.childCount == 3) {
                if (pointcutExpression.getChild(0).text == "(")
                    return expression(pointcutExpression.pointcutExpression(0))
                else if (pointcutExpression.getChild(1).text == "||") {
                    val or = Or()
                    or.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    or.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return or
                } else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()

                    and.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    and.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return and
                }
            }
            throw IllegalArgumentException()
        }
    }

    inner class AdviceVisitor : AspectGrammarBaseVisitor<Advice>() {
        var advices = mutableListOf<Advice>()

        override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
            val boolExpr = buildExpression(ctx.pointcutExpression())
            val adviceCode = ctx.methodBody().block().blockStatement().
                    map { it.text }.
                    foldRight("") { total, next -> "$total\n$next" }
            advices.add(Advice(ctx.adviceSpec().text, boolExpr, adviceCode))
            return Advice("", NodeItem("", ""), "")
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            return expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            if (pointcutExpression.childCount == 1) {
                if (pointcutExpression.referencePointcut() != null) {
                    pointcutList.forEach {
                        if (it.id == pointcutExpression.referencePointcut().id().text)
                            return ReferencePointcutNodeItem(it.key)
                    }
                }
                if (pointcutExpression.getChild(0).childCount == 2)
                    return NodeItem(pointcutExpression.getChild(0).getChild(0).text, null)
                return NodeItem(pointcutExpression.getChild(0).getChild(2).text, pointcutExpression.getChild(0).getChild(0).text)

            }

            if (pointcutExpression.childCount == 2) {
                val not = Not()
                not.setChild(expression(pointcutExpression.pointcutExpression(0)))
                return not
            }

            if (pointcutExpression.childCount == 3) {
                if (pointcutExpression.getChild(0).text == "(")
                    return expression(pointcutExpression.pointcutExpression(0))
                else if (pointcutExpression.getChild(1).text == "||") {
                    val or = Or()
                    or.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    or.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return or
                } else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()
                    and.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    and.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return and
                }
            }
            throw IllegalArgumentException()
        }
    }
}