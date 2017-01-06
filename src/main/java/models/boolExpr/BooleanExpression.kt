
package models.boolExpr


/**
 * Created by sba on 06.12.16.
 */

/*
Абстрактные классы
 */
interface BooleanExpression

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
        return String.format("($left || $right)")
    }
}

class And : NonTerminal() {
    override fun toString(): String {
        return String.format("($left && $right)")
    }
}

class Not : NonTerminal() {
    fun setChild(child: BooleanExpression?) {
        this.setLeftNode(child)
    }

    override fun toString(): String {
        return String.format("!($left)")
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

    public fun addModifier(modifier: String) {
        this.modifierList.add(modifier)
    }

    public fun getModifierList(): MutableList<String> {
        return this.modifierList
    }


    public fun getIdentifier(): String {
        return identifier
    }
}

