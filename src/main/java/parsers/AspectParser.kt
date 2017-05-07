package parsers

import models.aspect.Aspect
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import parsers.antlrParsers.AspectGrammarLexer
import parsers.antlrParsers.AspectGrammarParser
import parsers.visitors.AspectVisitor
import java.io.FileInputStream

object AspectParser {
    fun parseFile(fileName: String): Aspect {
        val input = ANTLRInputStream(FileInputStream(fileName))
        val lexer = AspectGrammarLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = AspectGrammarParser(tokens)
        val tree = parser.aspectDeclaration()

        return AspectVisitor().visit(tree)
    }
}