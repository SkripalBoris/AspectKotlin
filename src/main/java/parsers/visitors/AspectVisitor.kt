package parsers.visitors

import models.aspect.Advice
import models.aspect.Aspect
import models.aspect.Pointcut
import org.jetbrains.annotations.NotNull
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser
import org.jetbrains.kotlin.codegen.AsmUtil.method
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls.accept



/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {
    override fun visitAspectDeclaration(@NotNull ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        var id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)

        return Aspect(id, pointcutVisitor.pointcuts)
    }

    private class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>(){
        var pointcuts = mutableListOf<Pointcut>()
        override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
            pointcuts.add(Pointcut(ctx.id().text))
            return Pointcut("")
        }
    }

    private class AdviceVisitor : AspectGrammarBaseVisitor<Advice>(){
        var advices = mutableListOf<Advice>()
        override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
            advices.add(Advice(ctx.adviceSpec().text))
            return Advice("")
        }
    }

}