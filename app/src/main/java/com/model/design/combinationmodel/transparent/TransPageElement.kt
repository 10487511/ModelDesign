package com.model.design.combinationmodel.transparent

/**
 * @Author LuoKun
 * @Des
 */
abstract class TransPageElement {

    var mPageElement: MutableList<TransPageElement> = mutableListOf()
    var name: String = ""

    constructor(name: String) {
        this.name = name
    }

    abstract fun addPageElement(pageElement: TransPageElement)
    abstract fun rmPageElement(pageElement: TransPageElement)
    abstract fun clear()
    abstract fun print(placeHolder: String)
}