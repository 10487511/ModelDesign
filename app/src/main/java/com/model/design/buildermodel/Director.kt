package com.model.design.buildermodel

import android.app.Activity
import android.widget.Toast

/**指挥官*/

class Director(private var mBuild: Builder) {

    private var mCPU: String = ""
    private var mMemory: String = ""
    private var mHD: String = ""

    fun construct(cpu: String, memory: String, hd: String) {
        mBuild.buildCPU(cpu)
        mBuild.buildMemory(memory)
        mBuild.buildHD(hd)

        mCPU = cpu
        mMemory = memory
        mHD = hd
    }

    fun showMessage(a: Activity) {
        Toast.makeText(a, "我组装了一台CPU为$mCPU,内存为$mMemory,的$mHD，大小的硬盘的台式电脑", Toast.LENGTH_LONG).show()
    }

}