package com.lk.studyAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lk.studyAndroid.buildermodel.Builder
import com.lk.studyAndroid.buildermodel.ConcreteBuilder
import com.lk.studyAndroid.buildermodel.Director
import com.lk.studyAndroid.observermodel.Boy
import com.lk.studyAndroid.observermodel.Girl
import com.lk.studyAndroid.observermodel.Observable
import com.lk.studyAndroid.observermodel.PostMan
import com.lk.studyAndroid.singletonmodel.Singleton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        testObserver()
//        testSingleton()
        testBuilder()
    }

    /**观察者模式*/
    private fun testObserver() {
        val postMan: Observable = PostMan()

        val boy1 = Boy("工藤新一")
        val boy2 = Boy("毛利小五郎")
        val girl = Girl("毛利兰")

        postMan.add(boy1)
        postMan.add(boy2)
        postMan.add(girl)

        postMan.notify("快递到了，下楼领取。。。。")
    }

    /**单例模式*/
    private fun testSingleton() {
        /**饿汉式*/
//        Singleton.showSomeThing(this@MainActivity)
        /**懒汉式*/
//        Singleton.get().showSomeThing(this@MainActivity)
        /**线程安全的懒汉式*/
//        Singleton.get().showSomeThing(this@MainActivity)
        /**双重效验锁*/
//        Singleton.instance.showSomeThing(this@MainActivity)
        /**静态内部类*/
//        Singleton.instance.showSomeThing(this@MainActivity)
        /**双重效验锁(增加属性值)*/
        Singleton.getInstance(5).showSomeThing(this@MainActivity)
    }

    /**建造者模式*/
    private fun testBuilder(){
        val builder :Builder = ConcreteBuilder()
        val director: Director = Director(builder)
        director.construct(
            "i7-11500K",
            "三星DDR4 32g",
            "西数2TB"
        )
    }

}