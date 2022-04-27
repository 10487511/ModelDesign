package com.model.design.mediatormodel

/**
 * @Author LuoKun
 * @Des
 */
abstract class Person {

    var houseMediator: HouseMediator? = null

    constructor(houseMediator: HouseMediator?) {
        this.houseMediator = houseMediator
    }

    abstract fun send(msg: String)//发布消息
    abstract fun getNotice(msg: String)//接受消息
}