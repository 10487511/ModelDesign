package com.model.design.abstractfactorymodel

import android.util.Log

/**具体产品类*/
class WDHD:HD() {
    override fun showHD() {
        Log.e("model","WD 硬盘")
    }
}