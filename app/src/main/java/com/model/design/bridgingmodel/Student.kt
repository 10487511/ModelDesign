package com.model.design.bridgingmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Student : Person() {
    override fun dress() {
        Log.e("model", "学生穿上了：${mClothes?.getName()}")
    }
}