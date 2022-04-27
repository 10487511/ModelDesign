package com.model.design.statemodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class DogState : PersonState {
    override fun movies() {
        Log.e("model", "一个人看电影")
    }

    override fun shopping() {
        Log.e("model", "一个人不配逛街")
    }
}