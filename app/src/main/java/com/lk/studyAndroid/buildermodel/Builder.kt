package com.lk.studyAndroid.buildermodel

/**定义抽象建造者*/
/**事务实现过程*/

abstract class Builder {
    abstract fun buildCPU(CPU: String)
    abstract fun buildMemory(memory: String)
    abstract fun buildHD(hd: String)
    abstract fun create(): Computer
}