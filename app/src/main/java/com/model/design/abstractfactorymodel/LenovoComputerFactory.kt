package com.model.design.abstractfactorymodel

/**具体工厂类*/
class LenovoComputerFactory : ComputerFactory() {
    override fun createCPU(): CPU {
        return IntelCPU()
    }

    override fun createMemory(): Memory {
        return SamsungMemory()
    }

    override fun createHD(): HD {
        return SeagateHD()
    }

    fun show(){

    }
}