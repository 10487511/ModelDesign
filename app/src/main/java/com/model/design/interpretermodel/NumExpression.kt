package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class NumExpression : ArithmeticExpression {

    private var strNmu: String = ""

    constructor(strNmu: String) : super() {
        this.strNmu = strNmu
    }

    override fun interpret(areaRole: AreaRole): Any {
        return strNmu.toInt()
    }
}