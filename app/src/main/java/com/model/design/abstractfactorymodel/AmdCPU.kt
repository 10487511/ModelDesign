package com.model.design.abstractfactorymodel

import android.util.Log
/**具体产品类*/
class AmdCPU : CPU() {
    override fun showCPU() {
        Log.e("model","AMD CPU")
    }
}