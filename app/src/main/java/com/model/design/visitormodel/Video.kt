package com.model.design.visitormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Video : AccessWeb {

    constructor(name: String) : super(name)

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun download() {
        Log.e("model", "--下载视频--")
    }

    fun playVideo() {
        Log.e("model", "~~播放视频~~")
    }
}