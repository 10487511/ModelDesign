package com.model.design.interpretermodel

/**
 * @Author LuoKun
 * @Des
 */
class AreaRole {

    var mMap: MutableMap<String, Any> = mutableMapOf()

    fun put(key: String, value: Int) {
        mMap[key] = value
    }

    fun get(key: String): Int {
        return (mMap[key]).toString().toInt()
    }

}