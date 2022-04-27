package com.model.design.observermodel


class Girl(var name: String) : Observer {

    override fun update(message: String) {//女孩的具体反应
        println("$name，收到了信息：$message,开始做事了")
    }
}