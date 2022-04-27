package com.model.design.combinationmodel.safe

import android.util.Log

/**
 * @Author LuoKun
 * @Des 安全的组合模式
 */
class SafeCombination {

    abstract class SafePageElement {

        var name: String = ""

        constructor(name: String) {
            this.name = name
        }

        abstract fun print(placeHolder: String)
    }

    class LeafNode : SafePageElement {
        constructor(name: String) : super(name)

        override fun print(placeHolder: String) {
            Log.e("model", "$placeHolder------$name")
        }
    }

    class BranchesNode : SafePageElement {

        private var mPageElements: MutableList<SafePageElement> = mutableListOf()

        constructor(name: String) : super(name)

        fun addPageElement(safePageElement: SafePageElement) {
            mPageElements.add(safePageElement)
        }

        fun removePageElement(safePageElement: SafePageElement) {
            mPageElements.remove(safePageElement)
        }

        fun clear() {
            mPageElements.clear()
        }

        override fun print(placeHolder: String) {
            Log.e("model", "$placeHolder└──$name")
            val iterator = mPageElements.iterator()
            while (iterator.hasNext()) {
                val pageElement = iterator.next()
                pageElement.print("$placeHolder    ")
            }
        }
    }

}