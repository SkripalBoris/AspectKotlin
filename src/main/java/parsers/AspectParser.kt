package parsers

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import parsers.antlrParsers.*
import parsers.visitors.AspectVisitor
import java.io.FileInputStream

object AspectParser {
    fun parseFile(fileName: String) {
        val input = ANTLRInputStream(FileInputStream(fileName))
        val lexer = AspectGrammarLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = AspectGrammarParser(tokens)
        var tree = parser.aspectDeclaration()

        val res = AspectVisitor().visit(tree)
    }
}