package com.model.design.responsibilitymodel

/**
 * @Author LuoKun
 * @Des
 */
abstract class Postman {
    var nextPostman: Postman? = null
    abstract fun handleCourier(address: String)
}