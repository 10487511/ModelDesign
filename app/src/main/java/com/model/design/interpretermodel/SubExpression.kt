package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class SubExpression :ArithmeticExpression {

    private var left: ArithmeticExpression? = null
    private var right: ArithmeticExpression? = null

    constructor(left: ArithmeticExpression?, right: ArithmeticExpression?) : super() {
        this.left = left
        this.right = right
    }

    override fun interpret(areaRole: AreaRole): Any {
        return areaRole.get(left?.interpret(areaRole).toString()) - areaRole.get(
            right?.interpret(
                areaRole
            ).toString()
        )
    }
}