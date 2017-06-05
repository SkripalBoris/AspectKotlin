package parsers.visitors

import models.aspect.AfterAdvice
import models.aspect.BeforeAdvice
import models.aspect.items.CallNodeItem
import models.aspect.items.ExecutionNodeItem
import models.aspect.items.ExtensionType
import models.boolExpr.Not
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by boris on 16.05.17.
 */
class AspectVisitorTest {
    @Test
    fun visitAspectDeclarationFirst() {
        val aspect = parseFile("res/aspect_example_1.ak")
        assertEquals("A", aspect.id)
        assertEquals(2, aspect.pointcuts.size)

        val fooPC = aspect.pointcuts.findLast { it.id == "FooPC" }
        assertNotNull(fooPC)
        val pointcutExpression = fooPC?.pointcutExpression
        assertTrue(pointcutExpression is CallNodeItem)
        assertEquals("foo", (pointcutExpression as CallNodeItem).methodPattern.name.name)
        assertFalse(pointcutExpression.methodPattern.name.negative)
        assertEquals(ExtensionType.ANYTHING, pointcutExpression.methodPattern.extensionModifier)

        val advice = aspect.advices.last()
        assertTrue(advice is BeforeAdvice)
        assertEquals("println(\"foo\")",advice.adviceCode.replace("\t", "").replace("\n", "").replace(" ", ""))
    }

    @Test
    fun visitAspectDeclarationSecond() {
        val aspect = parseFile("res/aspect_example_2.ak")
        assertEquals("B", aspect.id)
        assertEquals(2, aspect.pointcuts.size)

        val barPC = aspect.pointcuts.findLast { it.id == "BarPC" }
        assertNotNull(barPC)
        val pointcutExpression = barPC?.pointcutExpression
        assertTrue(pointcutExpression is Not)
        val child = (pointcutExpression as Not).child
        assertTrue(child is ExecutionNodeItem)
        assertEquals("bar", (child as ExecutionNodeItem).methodPattern.name.name)
        assertFalse(child.methodPattern.name.negative)
        assertEquals(ExtensionType.EXTENSION, child.methodPattern.extensionModifier)

        val advice = aspect.advices.last()
        assertTrue(advice is AfterAdvice)
        assertEquals("println(\"bar\")",advice.adviceCode.replace("\t", "").replace("\n", "").replace(" ", ""))
    }

    @Test
    fun visitAspectDeclarationThird() {
        val aspect = parseFile("res/aspect_example_3.ak")
        assertEquals("C", aspect.id)
    }
}