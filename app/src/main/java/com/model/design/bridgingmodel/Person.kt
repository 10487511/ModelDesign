package com.model.design.bridgingmodel

/**
 * @Author LuoKun
 * @Des
 */
abstract class Person {

    var mClothes: Clothes? = null

    fun setClothes(clothes: Clothes) {
        mClothes = clothes
    }

    abstract fun dress()

}