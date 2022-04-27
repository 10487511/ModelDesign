package com.model.design.abstractfactorymodel

import android.util.Log

/**具体产品类*/
class SeagateHD:HD() {
    override fun showHD() {
        Log.e("mode","Seagate 硬盘")
    }
}