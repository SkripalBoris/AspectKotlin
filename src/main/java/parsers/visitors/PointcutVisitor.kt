package parsers.visitors

import models.aspect.items.*
import models.aspect.Pointcut
import models.boolExpr.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser

/**
 * Created by boris on 07.05.17.
 */
class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>() {
    var pointcuts = mutableListOf<Pointcut>()

    override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
        val boolExpr = buildExpression(ctx.pointcutExpression(), ctx.formalParameters().formalParameterList())
        val pointcut = Pointcut(ctx.id().text, boolExpr)
        pointcuts.add(pointcut)
        return pointcut
    }

    private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext,
                                paramList: AspectGrammarParser.FormalParameterListContext?): BooleanExpression {
        return expression(pointcutExpression, paramList)
    }

    private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext,
                           paramList: AspectGrammarParser.FormalParameterListContext?): BooleanExpression {
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
                    var type = ParameterModel((pointcutExpression.pointcutPrimitive() as AspectGrammarParser.TargetPointcutContext).typeOrIdentifier().typeType().text,  nullableModifier = NullabilityType.ANYTHING)
                    if (paramList != null) {
                        paramList.formalParameter().forEach {
                            val identifier = it.variableDeclaratorId().Identifier().text
                            if (identifier == type.typeName) {
                                type = buildType(it.typeType())
                                return@forEach
                            }
                        }
                    }
                    return TargetNodeItem(type)
                }
                return NodeItem(pointcutExpression.getChild(0).getChild(2).text, pointcutExpression.getChild(0).getChild(0).text)
            }
        }

        if (pointcutExpression.childCount == 2) {
            val not = Not()
            not.setChild(expression(pointcutExpression.pointcutExpression(0), paramList))
            return not
        }

        if (pointcutExpression.childCount == 3) {
            if (pointcutExpression.getChild(0).text == "(")
                return expression(pointcutExpression.pointcutExpression(0), paramList)
            else if (pointcutExpression.getChild(1).text == "||") {
                val or = Or()
                or.setLeftNode(expression(pointcutExpression.pointcutExpression(0), paramList))
                or.setRightNode(expression(pointcutExpression.pointcutExpression(1), paramList))
                return or
            } else if (pointcutExpression.getChild(1).text == "&&") {
                val and = And()

                and.setLeftNode(expression(pointcutExpression.pointcutExpression(0), paramList))
                and.setRightNode(expression(pointcutExpression.pointcutExpression(1), paramList))
                return and
            }
        }
        throw IllegalArgumentException()
    }

    fun buildModifiersList(modifier: AspectGrammarParser.MethodModifiersPatternContext?): MutableList<ParameterModel> {
        if (modifier == null)
            return mutableListOf()
        if (modifier.methodModifiersPattern().isEmpty())
            return mutableListOf(ParameterModel(modifier.methodModifier().text, false))
        val retList = buildModifiersList(modifier.methodModifiersPattern().first())
        retList.add(ParameterModel(modifier.methodModifier().text, false))
        return retList
    }

    fun fillMethod(methodPattern: AspectGrammarParser.MethodPatternContext): MethodPattern {
        var extensionModifier = ExtensionType.ANYTHING
        methodPattern.extensionModifier()?.let { modifier ->
            extensionModifier = if (modifier.children.first().text == "!")
                ExtensionType.NOT_EXTENSION
            else
                ExtensionType.EXTENSION
        }

        var inlineModifier = InlineType.ANYTHING
        methodPattern.inlineModifier()?.let { modifier ->
            inlineModifier = if (modifier.children.first().text == "!")
                InlineType.NOT_INLINE
            else
                InlineType.INLINE
        }

        val annotations = if (methodPattern.annotationPattern() == null)
            mutableListOf<ParameterModel>()
        else
            methodPattern.annotationPattern().annotationTypePattern().map { ParameterModel(it.text, false) }

        val modifiers = buildModifiersList(methodPattern.methodModifiersPattern())

        val type = if(methodPattern.typePattern() != null) ParameterModel(methodPattern.typePattern().simpleTypePattern().text) else ParameterModel()

        val name = ParameterModel(methodPattern.simpleNamePattern().text)
        val params = mutableListOf<ParameterModel>()
        methodPattern.formalParametersPattern().formalsPattern()?.let {formals ->
            formals.children.filter { it !is TerminalNodeImpl }.forEach {
                val parameter = buildType(it as ParserRuleContext)
                params.add(parameter)
            }
        }
        val retType = buildType(methodPattern.retTypePattern())

        return MethodPattern(annotations, modifiers, type, name, params, retType, extensionModifier, inlineModifier)
    }
}