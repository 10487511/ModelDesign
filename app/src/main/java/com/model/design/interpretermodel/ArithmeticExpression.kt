package com.model.design.interpretermodel

import android.content.Context

/**
 * @Author LuoKun
 * @Des 抽象算术表达式
 */
abstract class ArithmeticExpression {
    abstract fun interpret(areaRole: AreaRole): Any?
}