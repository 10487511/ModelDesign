package com.model.design.statemodel

import android.util.Log

/**
 * @Author LuoKun
 * @Des
 */
class EnvironmentUse {

    private var mPersonState: PersonState? = null

    fun setPersonState(personState: PersonState) {
        this.mPersonState = personState
    }

    fun doublePerson(){
        Log.e("model","进入恋爱模式")
        setPersonState(LoveState())
    }

    fun singlePerson(){
        Log.e("model","进入单身狗模式")
        setPersonState(DogState())
    }

    fun movies(){
        mPersonState?.movies()
    }

    fun shopping(){
        mPersonState?.shopping()
    }

}