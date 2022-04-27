package com.model.design.visitormodel

/**
 * @Author LuoKun
 * @Des
 */
class Websites {

    var list: MutableList<AccessWeb> = mutableListOf()

    fun accept(visitor: Visitor) {
        var iterator: Iterator<AccessWeb> = list.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(visitor)
        }
    }

    fun addWeb(web: AccessWeb) {
        list.add(web)
    }

}