package parsers.visitors

import models.aspect.items.NullabilityType
import models.aspect.items.ParameterModel
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import parsers.antlrParsers.AspectGrammarParser

/**
 * Created by boris on 08.05.17.
 */

fun buildSimpleType(typeContext: AspectGrammarParser.TypePatternContext?): ParameterModel {
    typeContext?.let { type ->
        var negative = false
        type.children.firstOrNull()?.let {
            if (it is TerminalNodeImpl && it.text == "!")
                negative = true
        }
        type.simpleTypePattern()?.let { simpleType ->
            // Берем только первый элемент, т.к. не поддерживаем несколько типов
            simpleType.dottedNamePattern().typeType().firstOrNull()?.let { typeType ->
                var nullability = NullabilityType.ANYTHING
                typeType.nullabilityModifier()?.let { nullabilityMod ->
                    nullabilityMod.notNullModifier()?.let {
                        nullability = NullabilityType.NOT_NULL
                    }
                    nullabilityMod.nullModifier()?.let {
                        nullability = NullabilityType.NULLABLE
                    }
                }
                typeType.classOrInterfaceType()?.let { classOrInterface ->
                    buildPackage(classOrInterface)
                    return ParameterModel(typeName = classOrInterface.Identifier().fold("") { total, next -> total + next },
                            nullableModifier = nullability,
                            negative = negative)
                }
                typeType.primitiveType()?.let { primitiveType ->
                    return ParameterModel(typeName = primitiveType.text,
                            nullableModifier = nullability,
                            negative = negative)
                }
            }
        }
        type.typePattern().firstOrNull()?.let {
            val retType = buildSimpleType(it)
            retType.negative = negative
            return retType
        }
    }
    return ParameterModel()
}

fun buildPackage(context: ParserRuleContext): String {
    if (context is AspectGrammarParser.OptionalParensTypePatternContext)
        context.annotationPattern()?.let {
            return it.text
        }
    return ""
}

fun buildType(typeContext: ParserRuleContext?): ParameterModel {
    if (typeContext is AspectGrammarParser.OptionalParensTypePatternContext) {
        val simpleType = buildSimpleType(typeContext.typePattern())
        simpleType.packageName = buildPackage(typeContext)
        return simpleType
    }

    if (typeContext is AspectGrammarParser.FormalsPatternContext) {
        val simpleType = buildSimpleType(typeContext.optionalParensTypePattern().typePattern())
        simpleType.packageName = buildPackage(typeContext)
        return simpleType
    }

    if (typeContext is AspectGrammarParser.RetTypePatternContext) {
        val simpleType = buildSimpleType(typeContext.typePattern())
        simpleType.packageName = buildPackage(typeContext)
        return simpleType
    }

    if (typeContext is AspectGrammarParser.TypeTypeContext) {
        val typeName = typeContext.classOrInterfaceType().Identifier().last().text
        val packageName = typeContext.classOrInterfaceType().Identifier().let {
            it.filterIndexed { i, terminalNode -> i < it.size - 1 }.fold("") { total, next -> if (total.isEmpty()) next.text else "$total.$next" }
        }
        var nullabilityType = NullabilityType.ANYTHING
        typeContext.nullabilityModifier()?.let { nullMod ->
            nullabilityType = if (nullMod.nullModifier() != null)
                NullabilityType.NOT_NULL
            else
                NullabilityType.NULLABLE
        }
        return ParameterModel(typeName, nullableModifier = nullabilityType, packageName = packageName)
    }
    return ParameterModel()
}