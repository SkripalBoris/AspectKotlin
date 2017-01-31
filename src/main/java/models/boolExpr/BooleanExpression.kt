
package models.boolExpr

import com.intellij.psi.PsiElement
import javax.naming.OperationNotSupportedException


/**
 * Created by sba on 06.12.16.
 */

/*
Абстрактные классы
 */
interface BooleanExpression {
    fun calcExpression(psiElement: PsiElement): Boolean
}

abstract class NonTerminal : BooleanExpression {
    protected var left: BooleanExpression?
    protected var right: BooleanExpression?

    init {
        this.left = null
        this.right = null
    }

    fun setLeftNode(left: BooleanExpression?) {
        this.left = left
    }

    fun setRightNode(right: BooleanExpression?) {
        this.right = right
    }

    fun getLeftNode(): BooleanExpression {
        return this.left!!
    }

    fun getRightNode(): BooleanExpression {
        return this.right!!
    }
}

abstract class Terminal(protected var value: String) : BooleanExpression {
    override fun toString(): String = value
}

/*
Реализации
 */

class Or : NonTerminal() {
    override fun toString(): String {
        return String.format("($left || $right)")
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.left!!.calcExpression(psiElement) || this.right!!.calcExpression(psiElement)
    }
}

class And : NonTerminal() {
    override fun toString(): String {
        return String.format("($left && $right)")
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.left!!.calcExpression(psiElement) && this.right!!.calcExpression(psiElement)
    }
}

class Not : NonTerminal() {
    fun setChild(child: BooleanExpression?) {
        this.setLeftNode(child)
    }

    fun getChild(): BooleanExpression {
        return this.getLeftNode()
    }

    override fun toString(): String {
        return String.format("!($left)")
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return !this.getChild().calcExpression(psiElement)
    }
}

class NodeItem(identifier: String, modifier: String?) : Terminal(identifier) {
    private var modifierList: MutableList<String>
    private var identifier: String

    init {
        modifierList = mutableListOf()
        if (modifier != null)
            modifierList.add(modifier)

        this.identifier = identifier
    }
    override fun toString(): String {
        var retString = ""

        for (mod in modifierList)
            retString += mod + "("

        retString += this.identifier

        for(mod in modifierList)
            retString += ")"
        return retString
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        throw OperationNotSupportedException()
    }
}

