package com.model.design.ordermodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class ShutdownCommand :Command {

    private var receiver:Receiver? = null

    constructor(receiver: Receiver?) {
        this.receiver = receiver
    }

    override fun execute() {
        Log.e("model","命令角色执行关机命令")
        receiver?.action()
    }
}