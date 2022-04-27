package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class EqualExpression : ArithmeticExpression {

    private var left: ArithmeticExpression? = null
    private var right: ArithmeticExpression? = null

    constructor(left: ArithmeticExpression?, right: ArithmeticExpression?) : super() {
        this.left = left
        this.right = right
    }

    override fun interpret(areaRole: AreaRole): Any? {
        areaRole.put(
            left?.interpret(areaRole).toString(),
            right?.interpret(areaRole).toString().toInt()
        )
        return null
    }
}