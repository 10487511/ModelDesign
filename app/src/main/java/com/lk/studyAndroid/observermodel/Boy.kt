package com.lk.studyAndroid.observermodel


class Boy(var name: String) : Observer {

    override fun update(message: String) {//男孩的具体反应
        println("$name，收到了信息：$message,开始做事了")
    }
}