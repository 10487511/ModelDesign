package com.model.design.decoratormodel

/**
 * @Author LuoKun
 * @Des
 */
abstract class RoomDecorator : Room {

    private var mRoom: Room? = null

    constructor(mRoom: Room?) : super() {
        this.mRoom = mRoom
    }

    override fun fitment() {
        mRoom?.fitment()
    }
}