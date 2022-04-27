package com.model.design.mediatormodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class LianJia : HouseMediator {

    var mPurchaser: Purchaser? = null
    var mLandlord: Landlord? = null

    override fun notice(person: Person, msg: String) {
        Log.e("model", "中介收到消息，并转发给对应人群")
        if (person == mPurchaser) {
            mLandlord?.getNotice(msg)
        } else if (person == mLandlord) {
            mPurchaser?.getNotice(msg)
        }
    }

    fun setPurchaser(purchaser: Purchaser) {
        mPurchaser = purchaser
    }

    fun setLandlord(landlord: Landlord) {
        mLandlord = landlord
    }

}