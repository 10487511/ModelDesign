package com.model.design.simplefactorymodel

import java.lang.Exception

object Factory {

    /**常规实现*/
    fun create(productName: String): Product? {
        var product: Product? = null
        when (productName) {
            "A" -> {
                product = ProductA()
            }
            "B" -> {
                product = ProductA()
            }
        }
        return product
    }

    /**通过反射实现*/
    /**此方法性能要逊色于常规实现*/
    fun <T : Product> create1(clz: Class<T>): T? {
        var product: Product? = null
        try {
            product = Class.forName(clz.name).newInstance() as Product //反射出实例
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return product as T?
    }

}