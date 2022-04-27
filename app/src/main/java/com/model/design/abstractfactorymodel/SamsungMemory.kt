package com.model.design.abstractfactorymodel

import android.util.Log

/**具体产品类*/
class SamsungMemory :Memory() {
    override fun showMemory() {
        Log.e("model","Samsung 内存")
    }
}