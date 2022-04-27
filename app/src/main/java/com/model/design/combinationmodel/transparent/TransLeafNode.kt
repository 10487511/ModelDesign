package com.model.design.combinationmodel.transparent

import android.util.Log
import java.lang.UnsupportedOperationException

/**
 * @Author LuoKun
 * @Des
 */
class TransLeafNode : TransPageElement {

    constructor(name: String) : super(name)

    override fun addPageElement(pageElement: TransPageElement) {
        throw UnsupportedOperationException("不支持此操作")
    }

    override fun rmPageElement(pageElement: TransPageElement) {
        throw UnsupportedOperationException("不支持此操作")
    }

    override fun clear() {
        throw UnsupportedOperationException("不支持此操作")
    }

    override fun print(placeHolder: String) {
        Log.e("model", "$placeHolder -------${name}")
    }
}