package com.model.design.interpretermodel

import android.content.Context

/**
 * @Author LuoKun
 * @Des
 */
class AddExpression : ArithmeticExpression {

    private var left: ArithmeticExpression? = null
    private var right: ArithmeticExpression? = null

    constructor(left: ArithmeticExpression?, right: ArithmeticExpression?) : super() {
        this.left = left
        this.right = right
    }

    override fun interpret(areaRole: AreaRole): Any {
        return areaRole.get(left?.interpret(areaRole).toString()) + areaRole.get(
            right?.interpret(
                areaRole
            ).toString()
        )
    }
}