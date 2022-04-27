package com.model.design.outsidemodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class LoginManager {
    fun login() {
        Log.e("model", "打开登录界面")
        Log.e("model", "进行登录操作")
        Log.e("model", "登录成功")
    }
}

class PayManager {
    fun pay(money: Int) {
        Log.e("model", "生成订单信息")
        Log.e("model", "现在支付方式")
        Log.e("model", "支付成功：$money 元")
    }
}