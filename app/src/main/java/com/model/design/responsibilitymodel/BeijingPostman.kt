package com.model.design.responsibilitymodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class BeijingPostman : Postman() {
    override fun handleCourier(address: String) {
        if (address == "Beijing") {
            Log.e("model", "派送到北京")
            return
        } else {
            nextPostman?.handleCourier(address)
        }
    }
}