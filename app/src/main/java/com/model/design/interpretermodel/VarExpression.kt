package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class VarExpression : ArithmeticExpression {

    private var str: String = ""

    constructor(str: String) : super() {
        this.str = str
    }

    override fun interpret(areaRole: AreaRole): Any {
        return str
    }

}