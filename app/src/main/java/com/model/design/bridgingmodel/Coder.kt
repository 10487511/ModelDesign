package com.model.design.bridgingmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Coder : Person() {
    override fun dress() {
        Log.e("model", "程序员穿上了：${mClothes?.getName()}")
    }
}