package com.model.design.mediatormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Landlord : Person {

    constructor(houseMediator: HouseMediator?) : super(houseMediator)

    override fun send(msg: String) {
        Log.e("model", "房东发布信息：$msg")
        houseMediator?.notice(this, msg)
    }

    override fun getNotice(msg: String) {
        Log.e("model", "房东收到信息：$msg")
    }


}