package com.model.design.abstractfactorymodel

/**抽象工厂类*/
abstract class ComputerFactory {

    abstract fun createCPU(): CPU
    abstract fun createMemory(): Memory
    abstract fun createHD(): HD

}