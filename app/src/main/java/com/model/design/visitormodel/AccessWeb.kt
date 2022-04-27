package com.model.design.visitormodel

/**
 * @Author LuoKun
 * @Des
 */
abstract class AccessWeb {

    var name:String = ""

    constructor(name: String) {
        this.name = name
    }

    abstract fun accept(visitor: Visitor)

    abstract fun download()

}