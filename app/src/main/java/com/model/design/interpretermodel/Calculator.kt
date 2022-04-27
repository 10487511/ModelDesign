package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class Calculator {

    var areaRole = AreaRole()
    private var mExpression: ArithmeticExpression? = null

    fun read(str: String) {
        var split = str.split(" ")
        when (split[1]) {
            "=" -> {
                EqualExpression(
                    VarExpression(split[0]),
                    NumExpression(split[2])
                ).interpret(areaRole)
            }
            "+" -> {
                mExpression = AddExpression(VarExpression(split[0]), VarExpression(split[2]))
            }
            "-" -> {
                mExpression = SubExpression(VarExpression(split[0]), VarExpression(split[2]))
            }
        }
    }

    fun calculate(): Int {
        return mExpression?.interpret(areaRole).toString().toInt()
    }

}