package com.model.design.visitormodel

/**
 * @Author LuoKun
 * @Des
 */
interface Visitor {

    fun visit(music: Music)

    fun visit(video: Video)

}