package com.model.design.iteratormodel

/**
 * @Author LuoKun
 * @Des
 */
interface Aggregate {

    /**容器大小*/
    fun size(): Int

    /**获取获取中指定位置的号码*/
    fun getNum(location: Int): String

    /**添加号码到容器中*/
    fun addNum(tel: String)

    /**从容器中移除号码*/
    fun removeNum(tel: String)

    /**返回容器的迭代器*/
    fun iterator(): Iterator

}