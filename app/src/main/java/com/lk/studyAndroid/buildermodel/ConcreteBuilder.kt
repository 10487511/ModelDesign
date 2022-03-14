package com.lk.studyAndroid.buildermodel

/**创建搬砖的人*/

class ConcreteBuilder : Builder() {

    //实例化产品
    private var mComputer: Computer = Computer()

    override fun buildCPU(CPU: String) {
        mComputer.mCPU = CPU
    }

    override fun buildMemory(memory: String) {
        mComputer.mMemory = memory
    }

    override fun buildHD(hd: String) {
        mComputer.mHD = hd
    }

    override fun create(): Computer {
        return mComputer
    }
}