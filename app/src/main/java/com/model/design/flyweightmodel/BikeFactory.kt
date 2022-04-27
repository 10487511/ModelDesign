package com.model.design.flyweightmodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class BikeFactory {

    private var pool: MutableMap<String, IBike> = mutableMapOf()

    fun getBike(name: String): IBike? {
        var bike: IBike? = null
        if (pool.containsKey(name)) {
            Log.e("model", "押金已交，$name 可以用车了")
            bike = pool[name]
        } else {
            bike = ShareBike()
            pool[name] = bike
            Log.e("model", "$name 交了100块，可以骑车了")
        }
        return bike
    }

}