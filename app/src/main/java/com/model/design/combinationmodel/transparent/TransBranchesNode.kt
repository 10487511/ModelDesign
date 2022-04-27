package com.model.design.combinationmodel.transparent

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class TransBranchesNode : TransPageElement {

    constructor(name: String) : super(name)

    override fun addPageElement(pageElement: TransPageElement) {
        mPageElement.add(pageElement)
    }

    override fun rmPageElement(pageElement: TransPageElement) {
        mPageElement.remove(pageElement)
    }

    override fun clear() {
        mPageElement.clear()
    }

    override fun print(placeHolder: String) {
        Log.e("model", "$placeHolder └── $name")
        val iterator = mPageElement.iterator()
        while (iterator.hasNext()) {
            val pageElement = iterator.next()
            pageElement.print("$placeHolder    ")
        }
    }
}