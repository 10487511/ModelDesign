package com.model.design.templatemethodmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class PostA : TemplatePostman() {
    override fun call() {
        Log.e("model", "联系A出门取快递")
    }

    //如果这里有后续需求  需要重写sign()

}