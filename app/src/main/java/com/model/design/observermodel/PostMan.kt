package com.model.design.observermodel

/**快递员*/
class PostMan : Observable {

    //保存观察者的信息
    var personList: MutableList<Observer> = mutableListOf()

    override fun add(observer: Observer) {
        personList.add(observer)
    }

    override fun remove(observer: Observer) {
        personList.remove(observer)
    }

    /**逐一通知*/
    override fun notify(message: String) {
        for (observer: Observer in personList) {
            observer.update(message)
        }
    }
}