package com.model.design.responsibilitymodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class ShanghaiPostman : Postman() {
    override fun handleCourier(address: String) {
        if (address == "Shanghai") {
            Log.e("model", "派送到上海")
            return
        } else {
            nextPostman?.handleCourier(address)
        }
    }
}