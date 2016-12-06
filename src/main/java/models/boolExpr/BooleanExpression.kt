
package models.boolExpr


/**
 * Created by sba on 06.12.16.
 */

/*
Абстрактные классы
 */
interface BooleanExpression {

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
}

abstract class Terminal(protected var value: String) : BooleanExpression {
    override fun toString(): String = value
}

/*
Реализации
 */

class Or : NonTerminal() {
    override fun toString(): String {
        return String.format("($left | $right)")
    }
}

class And : NonTerminal() {
    override fun toString(): String {
        return String.format("($left | $right)")
    }
}

class Not : NonTerminal() {
    override fun toString(): String {
        return String.format("!($left)")
    }
}

class NodeItem(value: String) : Terminal(value) {
    override fun toString(): String {
        return value
    }
}

