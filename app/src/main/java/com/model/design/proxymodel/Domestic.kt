package com.model.design.proxymodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Domestic : Buyers {
    override fun buy() {
        Log.e("model", "买一个包包")
    }
}