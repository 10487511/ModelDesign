package com.model.design.flyweightmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class ShareBike : IBike {

    private var price: Int = 1
    private var total: Int = 0

    override fun billing(time: Int) {
        total = price * time
        Log.e("model", "骑车花费了：${total} 元")
    }
}