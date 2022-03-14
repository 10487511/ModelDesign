package com.lk.studyAndroid.buildermodel

/**指挥官*/

class Director(private var mBuild: Builder) {

    fun construct(cpu: String, memory: String, hd: String) {
        mBuild.buildCPU(cpu)
        mBuild.buildMemory(memory)
        mBuild.buildHD(hd)
    }

}