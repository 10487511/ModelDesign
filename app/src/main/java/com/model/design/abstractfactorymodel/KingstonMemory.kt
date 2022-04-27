package com.model.design.abstractfactorymodel

import android.util.Log

/**具体产品类*/
class KingstonMemory :Memory() {
    override fun showMemory() {
        Log.e("model","Kingston 内存")
    }
}