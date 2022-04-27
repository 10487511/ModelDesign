package com.model.design.iteratormodel

/**
 * @Author LuoKun
 * @Des
 */
class DeliveryIterator : Iterator {

    /**容器对象*/
    private var aggregate: Aggregate? = null

    /**当前索引*/
    private var index: Int = 0

    constructor(aggregate: Aggregate?) {
        this.aggregate = aggregate
    }

    override fun hasNext(): Boolean {
        return index < aggregate!!.size()
    }

    override fun next(): Any {
        return aggregate!!.getNum(index++)
    }
}