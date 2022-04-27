package com.model.design.ordermodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des 调用者
 */
class Invoker {

    private var command: Command? = null

    constructor(command: Command?) {
        this.command = command
    }

    fun action() {
        Log.e("model", "调用者执行命令")
        command?.execute()
    }

}