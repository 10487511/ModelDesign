package com.model.design.abstractfactorymodel

/**具体工厂类*/
class AsusComputerFactory : ComputerFactory() {
    override fun createCPU(): CPU {
        return AmdCPU()
    }

    override fun createMemory(): Memory {
        return KingstonMemory()
    }

    override fun createHD(): HD {
        return WDHD()
    }
}