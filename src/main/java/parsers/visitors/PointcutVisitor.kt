package parsers.visitors

import models.aspect.items.*
import models.aspect.pointcut.Pointcut
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
                    var nullabilityType = NullabilityType.ANYTHING
                    var type = ParameterModel((pointcutExpression.pointcutPrimitive() as AspectGrammarParser.TargetPointcutContext).typeOrIdentifier().typeType().text,  nullableModifier = nullabilityType)
                    if (paramList != null) {
                        paramList.formalParameter().forEach {
                            val identifier = it.variableDeclaratorId().Identifier().text
                            if (identifier == type.typeName) {
                                val typeName = it.typeType().classOrInterfaceType().Identifier().fold("") { total, next -> total + next.toString() }
                                it.typeType().nullabilityModifier()?.let { nullMod ->
                                    nullabilityType = if (nullMod.nullModifier() != null)
                                        NullabilityType.NOT_NULL
                                    else
                                        NullabilityType.NULLABLE
                                }
                                type = ParameterModel(typeName, nullableModifier = nullabilityType)
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

    private fun buildSimpleType(typeContext: AspectGrammarParser.TypePatternContext?): ParameterModel {
        typeContext?.let { type ->
            var negative = false
            type.children.firstOrNull()?.let {
                if (it is TerminalNodeImpl && it.text == "!")
                    negative = true
            }
            type.simpleTypePattern()?.let { simpleType ->
                // Березм только первый элемент, т.к. не поддерживаем несколько типов
                simpleType.dottedNamePattern().typeType().firstOrNull()?.let { type ->
                    var nullability = NullabilityType.ANYTHING
                    type.nullabilityModifier()?.let { nullabilityMod ->
                        nullabilityMod.notNullModifier()?.let {
                            nullability = NullabilityType.NOT_NULL
                        }
                        nullabilityMod.nullModifier()?.let {
                            nullability = NullabilityType.NULLABLE
                        }
                    }
                    type.classOrInterfaceType()?.let { classOrInterface ->
                        buildPackage(classOrInterface)
                        return ParameterModel(typeName = classOrInterface.text,
                                nullableModifier = nullability,
                                negative = negative)
                    }
                    type.primitiveType()?.let { primitiveType ->
                        return ParameterModel(typeName = primitiveType.text,
                                nullableModifier = nullability,
                                negative = negative)
                    }
                }
            }
            type.typePattern().firstOrNull()?.let {
                val retType = this.buildSimpleType(it)
                retType.negative = negative
                return retType
            }
        }
        return ParameterModel()
    }

    private fun buildPackage(context: ParserRuleContext): String {
        return ""
    }

    private fun buildType(typeContext: ParserRuleContext?): ParameterModel {
        if (typeContext is AspectGrammarParser.OptionalParensTypePatternContext) {
            val simpleType = buildSimpleType(typeContext.typePattern())
            buildPackage(typeContext)
            return simpleType
        }

        if (typeContext is AspectGrammarParser.FormalsPatternContext) {
            val simpleType = buildSimpleType(typeContext.optionalParensTypePattern().typePattern())
            buildPackage(typeContext)
            return simpleType
        }

        if (typeContext is AspectGrammarParser.RetTypePatternContext) {
            val simpleType = buildSimpleType(typeContext.typePattern())
            buildPackage(typeContext)
            return simpleType
        }
        return ParameterModel()
    }

    fun fillMethod(methodPattern: AspectGrammarParser.MethodPatternContext): MethodPattern {
        var extensionModifier = ExtensionType.ANYTHING
        if (methodPattern.extensionModifier() != null)
            extensionModifier = if (methodPattern.extensionModifier().children.first().text == "!")
                ExtensionType.NOT_EXTENSION
            else
                ExtensionType.EXTENSION

        var inlineModifier = InlineType.ANYTHING
        if (methodPattern.inlineModifier() != null)
            inlineModifier = if (methodPattern.inlineModifier().children.first().text == "!")
                InlineType.NOT_INLINE
            else
                InlineType.INLINE

        val annotations = if (methodPattern.annotationPattern() == null)
            mutableListOf<ParameterModel>()
        else
            methodPattern.annotationPattern().annotationTypePattern().map { ParameterModel(it.text, false) }

        val modifiers = buildModifiersList(methodPattern.methodModifiersPattern())

        val type = this.buildSimpleType(methodPattern.typePattern())

        val name = ParameterModel(methodPattern.simpleNamePattern().text)
        val params = mutableListOf<ParameterModel>()
        methodPattern.formalParametersPattern().formalsPattern()?.let {formals ->
            formals.children.filter { it !is TerminalNodeImpl }.forEach {
                val parameter = buildType(it as ParserRuleContext)
                /*val parameter = if (it is AspectGrammarParser.OptionalParensTypePatternContext)
                    it.typePattern()
                else
                    (it as AspectGrammarParser.FormalsPatternContext).optionalParensTypePattern().typePattern()

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
                params.add(ParameterModel(typeName, negative = negative, nullableModifier = nullableType))
                */
                params.add(parameter)
            }
        }
//        val retType = if (methodPattern.retTypePattern() == null)
//            null
//        else {
//            val negative = methodPattern.retTypePattern().childCount == 2 && methodPattern.retTypePattern().children[0].text == "!"
//            val typeNameNode = methodPattern.retTypePattern().typePattern()
//            val typeName = typeNameNode.children.first().text
//            var nullableType = NullabilityType.ANYTHING
//            if (typeNameNode.childCount == 2) {
//                nullableType = if (typeNameNode.children[1].text == "?")
//                    NullabilityType.NULLABLE
//                else
//                    NullabilityType.NOT_NULL
//            }
//            ParameterModel(typeName, negative = negative, nullableModifier = nullableType)
//        }
        val retType = buildType(methodPattern.retTypePattern())

        return MethodPattern(annotations, modifiers, type, name, params, retType, extensionModifier, inlineModifier)
    }
}