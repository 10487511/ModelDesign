package com.model.design.decoratormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class NewRoom : Room() {
    override fun fitment() {
        Log.e("model", "这是一间新房")
    }
}