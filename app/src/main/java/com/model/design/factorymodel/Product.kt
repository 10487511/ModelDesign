package com.model.design.factorymodel

import android.app.Activity

/** 创建抽象产品类，定义公共接口*/
abstract class Product {
    abstract fun show(a: Activity)
}