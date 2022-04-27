package com.model.design.statemodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class LoveState : PersonState {
    override fun movies() {
        Log.e("model", "手牵手看电影")
    }

    override fun shopping() {
        Log.e("model", "手牵手逛街")
    }
}