package com.model.design.memorandummodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Game {

    private var mLevel: Int = 1
    private var mCoin: Int = 0

    override fun toString(): String {
        return "game{mLevel = $mLevel ,mCoin= $mCoin }"
    }

    fun play() {
        Log.e("model", "升级了")
        mLevel++
        Log.e("model", "当前等级为：$mLevel")
        Log.e("model", "获得金币：32")
        mCoin += 32
        Log.e("model", "当前金币数量为：$mCoin")
    }

    fun exit() {
        Log.e("model", "退出游戏")
        Log.e("model", "退出游戏时的属性：${toString()}")
    }

    fun createMemento(): Memento {
        var memento = Memento()
        memento.level = mLevel
        memento.coin = mCoin
        return memento
    }

    fun setMemento(memento: Memento) {
        mLevel = memento.level
        mCoin = memento.coin
        Log.e("model", "读取存档信息：${toString()}")
    }

}