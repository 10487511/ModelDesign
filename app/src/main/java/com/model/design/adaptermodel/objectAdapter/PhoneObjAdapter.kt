package com.model.design.adaptermodel.objectAdapter

import android.util.Log
import com.model.design.adaptermodel.Adapter
import com.model.design.adaptermodel.Electric

/**
 * @Author LuoKun
 * @Des
 */
class PhoneObjAdapter : Adapter {

    private var electric: Electric? = null

    constructor(electric: Electric?) {
        this.electric = electric
    }

    override fun convert_5v(): Int {
        Log.e("model", "适配器开始工作")
        Log.e("model", "输入电压 ${electric?.output_220v()}")
        Log.e("model", "输出电压 5")
        return 5
    }
}