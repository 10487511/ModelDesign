package com.model.design.factorymodel

/** 创建抽象工厂类，定义公共接口*/
abstract class Factory {

    abstract fun create(): Product

}