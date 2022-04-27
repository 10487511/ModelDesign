package com.model.design.proxymodel

import android.util.Log
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * @Author LuoKun
 * @Des 动态代理
 */
class DynamicProxy : InvocationHandler {

    private var obj: Any? = null

    constructor(obj: Any?) {
        this.obj = obj
    }

    @Throws(Throwable::class)
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        Log.e("model", "动态代理调用方法：${method?.name}")
        //这里有问题 暂时不知道怎么解决 百度的结果就是这么写 但是还是崩溃
        return method!!.invoke(obj, *(args ?: arrayOfNulls<Any>(0)))
    }

}