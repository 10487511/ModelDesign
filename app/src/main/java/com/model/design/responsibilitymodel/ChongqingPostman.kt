package com.model.design.responsibilitymodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class ChongqingPostman : Postman() {
    override fun handleCourier(address: String) {
        if (address == "Chongqing") {
            Log.e("model", "派送到重庆")
            return
        } else {
            nextPostman?.handleCourier(address)
        }
    }
}