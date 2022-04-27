package com.model.design.factorymodel

/**创建具体工厂类，继承抽象工厂类，实现创建具体的产品*/

class FactoryA : Factory() {
    override fun create(): Product {
        return ProductA()
    }

}