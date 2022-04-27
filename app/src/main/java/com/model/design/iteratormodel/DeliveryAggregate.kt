package com.model.design.iteratormodel

/**
 * @Author LuoKun
 * @Des
 */
class DeliveryAggregate : Aggregate {

    private var list: MutableList<String> = mutableListOf()

    override fun size(): Int {
        return list.size
    }

    override fun getNum(location: Int): String {
        return list[location]
    }

    override fun addNum(tel: String) {
        list.add(tel)
    }

    override fun removeNum(tel: String) {
        list.remove(tel)
    }

    override fun iterator(): Iterator {
        return DeliveryIterator(this)
    }
}