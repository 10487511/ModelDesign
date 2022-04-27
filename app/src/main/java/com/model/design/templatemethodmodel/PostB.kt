package com.model.design.templatemethodmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class PostB : TemplatePostman() {
    override fun call() {
        Log.e("model", "联系B出门取快递")
    }

    /**覆盖父类的钩子方法，控制流程的走向*/
    override fun isSign():Boolean{
        return false
    }

    override fun refuse(){
        Log.e("model","拒收：商品不符")
    }

}