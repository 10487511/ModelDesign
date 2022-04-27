package com.model.design.proxymodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class Oversea : Buyers {

    private var mBuyers: Buyers? = null

    constructor(mBuyers: Buyers?) {
        this.mBuyers = mBuyers
    }

    override fun buy() {
        Log.e("model", "代购：")
        mBuyers?.buy()
    }
}