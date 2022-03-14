package com.lk.studyAndroid.observermodel

/** 抽象被观察者*/
interface Observable {
    fun add(observer: Observer)//添加观察者
    fun remove(observer: Observer)//删除观察者
    fun notify(message: String)//通知观察者
}