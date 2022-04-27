package com.model.design.prototypemodel

import android.util.Log


/**创建具体原型类*/
/**Cloneable 只读标识*/

class Card() : Cloneable {

    var num: Int = 0
    var spec: Spec = Spec()

    init {
        Log.e("model", "Card 执行了构造函数")
    }

    fun setSpec(length: Int, width: Int) {
        spec.width = width
        spec.length = length
    }

    override fun toString(): String {
        return "Card{\"num=\"$num,\"spec=\"$spec}"
    }

    public override fun clone(): Card {
        Log.e("model", "clone()时不执行构造函数")
        return super.clone() as Card
    }

    /**定义原型类的属性值*/
    /**浅克隆时  Spec不用实现Cloneable*/
    /**深克隆时  Spec需要实现Cloneable并重写clone()方法*/
    inner class Spec() : Cloneable {
        var width: Int = 0
        var length: Int = 0

        override fun toString(): String {
            return "Spec{\"width=\"$width,\"length=\"$length}"
        }

        override fun clone(): Spec {
            return super.clone() as Spec
        }

    }
}