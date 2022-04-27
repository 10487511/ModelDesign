package com.model.design.iteratormodel

/**
 * @Author LuoKun
 * @Des
 */
interface Iterator {

    /**查询是否有下一条记录*/
    fun hasNext():Boolean

    /**返回当前记录并移到下一条记录*/
    fun next():Any

}