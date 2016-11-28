package parsers

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarLexer
import parsers.antlrParsers.AspectGrammarParser
import java.io.FileInputStream

object AspectParser {
    fun parseFile(fileName: String) {
        val input = ANTLRInputStream(FileInputStream(fileName))
        val lexer = AspectGrammarLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = AspectGrammarParser(tokens)

        val tree = parser.aspectDeclaration()
        val visitor = AspectGrammarBaseVisitor<Void>().visit(tree)
    }
}