package com.model.design.abstractfactorymodel

import android.util.Log
/**具体产品类*/
class IntelCPU : CPU() {
    override fun showCPU() {
        Log.e("model","Inter CPU")
    }
}