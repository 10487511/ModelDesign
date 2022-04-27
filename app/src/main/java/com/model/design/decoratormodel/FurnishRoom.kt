package com.model.design.decoratormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class BedRoom : RoomDecorator {

    constructor(mRoom: Room?) : super(mRoom)

    override fun fitment() {
        super.fitment()
        addBedding()
    }

    private fun addBedding() {
        Log.e("model", "装修新房卧室")
    }

}

class KitRoom : RoomDecorator {
    constructor(mRoom: Room?) : super(mRoom)

    override fun fitment() {
        super.fitment()
        addKitchenware()
    }

    private fun addKitchenware() {
        Log.e("model", "装修新房厨房")
    }
}