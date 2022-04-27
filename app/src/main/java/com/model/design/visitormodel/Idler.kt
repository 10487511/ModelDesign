package com.model.design.visitormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Idler : Visitor {

    private var name: String = ""

    constructor(name: String) {
        this.name = name
    }

    override fun visit(music: Music) {
        Log.e("model", "$name 浏览音乐网站：${music.name}")
        music.playMusic()
    }

    override fun visit(video: Video) {
        Log.e("model","$name 浏览视频网站：${video.name}")
        video.playVideo()
    }
}