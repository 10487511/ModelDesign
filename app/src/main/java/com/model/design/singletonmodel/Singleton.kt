package com.model.design.singletonmodel

import android.app.Activity
import android.widget.Toast

/**单例类*/

/**饿汉式*/
//object Singleton {
//    fun showSomeThing(activity: Activity) {
//        Toast.makeText(activity, "饿汉式", Toast.LENGTH_SHORT).show()
//    }
//}

/**懒汉式*/
//class Singleton private constructor() {
//    companion object {
//        private var instance: Singleton? = null
//            get() {
//                if (field == null) {
//                    field = Singleton()
//                }
//                return field
//            }
//
//        fun get(): Singleton {
//            //这里不用getInstance作为为方法名，是因为在伴生对象声明时，内部已有getInstance方法，所以只能取其他名字
//            return instance!!
//        }
//    }
//
//    fun showSomeThing(activity: Activity) {
//        Toast.makeText(activity, "懒汉式", Toast.LENGTH_SHORT).show()
//    }
//}

/**线程安全的懒汉式*/
//class Singleton private constructor() {
//    companion object {
//        private var instance: Singleton? = null
//            get() {
//                if (field == null) {
//                    field = Singleton()
//                }
//                return field
//            }
//
//        @Synchronized
//        fun get(): Singleton {
//            return instance!!
//        }
//    }
//    fun showSomeThing(activity: Activity) {
//        Toast.makeText(activity, "线程安全的懒汉式", Toast.LENGTH_SHORT).show()
//    }
//}

/**双重效验锁*/
//class Singleton private constructor() {
//    companion object {
//        val instance: Singleton by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
//            Singleton()
//        }
//    }
//
//    fun showSomeThing(activity: Activity) {
//        Toast.makeText(activity, "双重效验锁", Toast.LENGTH_SHORT).show()
//    }
//}

/**静态内部类*/
//class Singleton private constructor(){
//    companion object{
//        val instance = SingletonHolder.holder
//    }
//
//    private object SingletonHolder{
//        val holder = Singleton()
//    }
//
//    fun showSomeThing(activity: Activity) {
//        Toast.makeText(activity, "静态内部类", Toast.LENGTH_SHORT).show()
//    }
//
//}

/**双重效验锁(增加属性值)*/
/**ps 传进去的值是给单例里面其他方法使用的 具体需求具体定制*/
class Singleton private constructor(private val p: Int) {
    companion object {
        @Volatile
        private var instance: Singleton? = null
        fun getInstance(p: Int) = instance ?: synchronized(this) {
            instance ?: Singleton(p).also {
                instance = it
            }
        }
    }

    fun showSomeThing(activity: Activity) {
        Toast.makeText(activity, "双重效验锁(增加属性值),$p", Toast.LENGTH_SHORT).show()
    }

}