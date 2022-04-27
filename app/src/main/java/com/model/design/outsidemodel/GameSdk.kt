package com.model.design.outsidemodel

/**
 * @Author LuoKun
 * @Des
 */
class GameSdk {

    fun login() {
        var loginManager = LoginManager()
        loginManager.login()
    }

    fun pay(money: Int) {
        var payManager = PayManager()
        payManager.pay(money)
    }

}