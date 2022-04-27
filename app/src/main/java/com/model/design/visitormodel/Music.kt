package com.model.design.visitormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Music : AccessWeb {

    constructor(name: String) : super(name)

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun download() {
        Log.e("model","--下载音乐--")
    }

    fun playMusic() {
        Log.e("model", "~~播放音乐~~")
    }
}