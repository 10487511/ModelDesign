package com.model.design.templatemethodmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
abstract class TemplatePostman {

    fun post() {
        prepare()
        call()
        if (isSign())
            sign()
        else
            refuse()
    }

    //准备操作，固定流程，父类实现
    private fun prepare() {
        Log.e("mode", "快递已达到，准备派送")
    }

    //联系收货人，联系人不一样，所以为抽象方法，子类实现
    abstract fun call()

    //是否签收,这个是钩子方法，用来控制流程的走向
    open fun isSign(): Boolean {
        return true
    }

    //签收，这个是固定流程，父类实现
    open fun sign() {
        Log.e("mode", "客户已签收，上报系统")
    }

    //拒签，空实现，这个也是钩子方法，子类可以跟进实际来决定是否去实现这个方法
    open fun refuse() {}

}