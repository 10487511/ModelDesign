package com.model.design

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.model.design.abstractfactorymodel.AsusComputerFactory
import com.model.design.abstractfactorymodel.ComputerFactory
import com.model.design.abstractfactorymodel.LenovoComputerFactory
import com.model.design.buildermodel.Builder
import com.model.design.buildermodel.ConcreteBuilder
import com.model.design.buildermodel.Director
import com.model.design.factorymodel.Factory
import com.model.design.factorymodel.FactoryA
import com.model.design.factorymodel.FactoryB
import com.model.design.interpretermodel.Calculator
import com.model.design.iteratormodel.Aggregate
import com.model.design.iteratormodel.DeliveryAggregate
import com.model.design.mediatormodel.Landlord
import com.model.design.mediatormodel.LianJia
import com.model.design.mediatormodel.Purchaser
import com.model.design.memorandummodel.Caretaker
import com.model.design.memorandummodel.Game
import com.model.design.memorandummodel.Memento
import com.model.design.observermodel.Boy
import com.model.design.observermodel.Girl
import com.model.design.observermodel.Observable
import com.model.design.observermodel.PostMan
import com.model.design.ordermodel.Invoker
import com.model.design.ordermodel.Receiver
import com.model.design.ordermodel.ShutdownCommand
import com.model.design.prototypemodel.Card
import com.model.design.proxymodel.Buyers
import com.model.design.proxymodel.Domestic
import com.model.design.proxymodel.DynamicProxy
import com.model.design.proxymodel.Oversea
import com.model.design.responsibilitymodel.BeijingPostman
import com.model.design.responsibilitymodel.ChongqingPostman
import com.model.design.responsibilitymodel.ShanghaiPostman
import com.model.design.singletonmodel.Singleton
import com.model.design.statemodel.EnvironmentUse
import com.model.design.strategymodel.AreaContext
import com.model.design.strategymodel.MoviesStrategy
import com.model.design.strategymodel.ShoppingStrategy
import com.model.design.templatemethodmodel.PostA
import com.model.design.templatemethodmodel.PostB
import com.model.design.templatemethodmodel.TemplatePostman
import com.model.design.visitormodel.*
import java.lang.reflect.Proxy
import android.provider.Contacts.People
import com.model.design.adaptermodel.Electric
import com.model.design.adaptermodel.classAdapter.PhoneClassAdapter
import com.model.design.adaptermodel.objectAdapter.PhoneObjAdapter
import com.model.design.bridgingmodel.Coder
import com.model.design.bridgingmodel.Shirt
import com.model.design.bridgingmodel.Student
import com.model.design.bridgingmodel.Uniform
import com.model.design.combinationmodel.safe.SafeCombination
import com.model.design.combinationmodel.transparent.TransBranchesNode
import com.model.design.combinationmodel.transparent.TransLeafNode
import com.model.design.combinationmodel.transparent.TransPageElement
import com.model.design.decoratormodel.BedRoom
import com.model.design.decoratormodel.KitRoom
import com.model.design.decoratormodel.NewRoom
import com.model.design.flyweightmodel.BikeFactory
import com.model.design.flyweightmodel.IBike
import com.model.design.outsidemodel.GameSdk


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        testObserver()
//        testSingleton()
//        testBuilder()
//        testFactory()
//        testSimpleFactory()
//        testAbstractFactory()
//        testPrototype()
//        testStrategy()
//        textState()
//        textResponsibility()
//        textTemplateMethod()
//        textIterator()
//        textMemorandum()
//        textVisitor()
//        textMediator()
//        textInterpreter()
//        textOrder()
//        textProxy()
//        textBridging()
//        textOutside()
//        textFlyweight()
//        textDecorator()
//        textAdapter()
        textCombination()
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
    private fun testBuilder() {
        val builder: Builder = ConcreteBuilder()
        val director: Director = Director(builder)
        director.construct(
            "i7-11500K",
            "三星DDR4 32g",
            "西数2TB"
        )
        director.showMessage(this@MainActivity)
    }

    /**工厂方法模式*/
    private fun testFactory() {
        val factoryA: Factory = FactoryA()
        val productA = factoryA.create()
        productA.show(this@MainActivity)

        val factoryB: Factory = FactoryB()
        val productB = factoryB.create()
        productB.show(this@MainActivity)
    }

    /**简单工厂方法模式*/
    private fun testSimpleFactory() {
//        com.model.design.simplefactorymodel.Factory.create("A")?.show(this@MainActivity)
//        com.model.design.simplefactorymodel.Factory.create("B")?.show(this@MainActivity)
        //因为没有C  所以不会执行show了
        com.model.design.simplefactorymodel.Factory.create("C")?.show(this@MainActivity)
        com.model.design.simplefactorymodel.Factory.create1(com.model.design.simplefactorymodel.ProductA::class.java)
            ?.show(this@MainActivity)
    }

    /**抽象工厂模式*/
    private fun testAbstractFactory() {
        val lenovoComputer: ComputerFactory = LenovoComputerFactory()
        lenovoComputer.createCPU().showCPU()
        lenovoComputer.createMemory().showMemory()
        lenovoComputer.createHD().showHD()

        val asusComputer: ComputerFactory = AsusComputerFactory()
        asusComputer.createCPU().showCPU()
        asusComputer.createMemory().showMemory()
        asusComputer.createHD().showHD()
    }

    /**原型模式*/
    private fun testPrototype() {
        val card1: Card = Card()
        card1.num = 8527
        card1.setSpec(10, 20)
        Log.e("model", card1.toString())

        val card2: Card = card1.clone()
        Log.e("model", card2.toString())
    }

    /**策略模式*/
    private fun testStrategy() {
        var areaContext: AreaContext = AreaContext(ShoppingStrategy())
        areaContext.chase()

        areaContext = AreaContext(MoviesStrategy())
        areaContext.chase()
    }

    /**状态模式*/
    private fun textState() {
        var environment = EnvironmentUse()
        environment.doublePerson()
        environment.shopping()
        environment.movies()
        environment.singlePerson()
        environment.shopping()
        environment.movies()
    }

    /**责任链模式*/
    private fun textResponsibility() {
        var beijingPostman = BeijingPostman()
        var shanghaiPostman = ShanghaiPostman()
        var chongqingPostman = ChongqingPostman()

        beijingPostman.nextPostman = shanghaiPostman
        shanghaiPostman.nextPostman = chongqingPostman

        Log.e("mode", "有一个上海的快递需要派送")
        beijingPostman.handleCourier("Shanghai")
        Log.e("model", "有一个广州的快递需要配送")
        beijingPostman.handleCourier("Guangzhou")
        Log.e("model", "有一个美国的快递需要配送")
        beijingPostman.handleCourier("America")
    }

    /**模板方法模式*/
    private fun textTemplateMethod() {
        Log.e("model", "----派送A----")
        var postA: TemplatePostman = PostA()
        postA.post()
        Log.e("model", "----派送B----")
        var postB: TemplatePostman = PostB()
        postB.post()
    }

    /**迭代器模式*/
    private fun textIterator() {
        var aggregate: Aggregate = DeliveryAggregate()
        aggregate.addNum("1111")
        aggregate.addNum("2222")
        aggregate.addNum("3333")
        aggregate.addNum("9527")

        var iterator = aggregate.iterator()
        while (iterator.hasNext()) {
            var tel = iterator.next()
            Log.e("model", "当前号码为 $tel")
        }
        Log.e("model", "遍历完毕")
    }

    /**备忘录模式*/
    private fun textMemorandum() {
        Log.e("model", "首次进入Game")
        var game: Game = Game()
        game.play()
        var memento: Memento = game.createMemento()
        var caretaker: Caretaker = Caretaker()
        caretaker.mMemento = memento
        game.exit()

        Log.e("model", "二次进入Game")
        var secondGame = Game()
        secondGame.setMemento(caretaker.mMemento!!)
        secondGame.play()
        secondGame.exit()
    }

    /**访问者模式*/
    private fun textVisitor() {
        var wanYiYun: Music = Music("网易云")
        var kuGou: Music = Music("酷狗")
        var youKu: Video = Video("优酷")
        var iQiYi: Video = Video("爱奇艺")

        var websites = Websites()
        websites.addWeb(wanYiYun)
        websites.addWeb(kuGou)
        websites.addWeb(youKu)
        websites.addWeb(iQiYi)

        var idler = Idler("闲人")
        websites.accept(idler)
    }

    /**中介者模式*/
    private fun textMediator() {
        var lianJia = LianJia()
        var purchaser = Purchaser(lianJia)
        var landlord = Landlord(lianJia)
        lianJia.setLandlord(landlord)
        lianJia.setPurchaser(purchaser)

        landlord.send("出售一套别野")
        purchaser.send("求购一套学区房")
    }

    /**解析器模式*/
    private fun textInterpreter() {
        var calculator = Calculator()
        calculator.read("a = 1024")
        calculator.read("b = 512")
        Log.e("model", "a = 1024")
        Log.e("model", "b = 512")
        //read的时候记得去匹配Calculator里面的逻辑判断
        calculator.read("a + b")
        Log.e("model", "a+b=${calculator.calculate()}")
        calculator.read("a - b")
        Log.e("model", "a-b=${calculator.calculate()}")
    }

    /**命令模式*/
    private fun textOrder() {
        var receiver = Receiver()
        var command = ShutdownCommand(receiver)
        var invoker = Invoker(command)
        invoker.action()
    }

    /**代理模式*/
    private fun textProxy() {
        //静态代理
//        var domestic: Buyers = Domestic()
//        var oversea: Buyers = Oversea(domestic)
//        oversea.buy()
        //动态代理（DynamicProxy有闪退问题  暂未解决）
        var domestic: Buyers = Domestic()
        var proxy = DynamicProxy(domestic)
        var classLoader = domestic.javaClass.classLoader
        var oversea: Buyers =
            Proxy.newProxyInstance(
                classLoader,
                arrayOf(Buyers::class.java),
                proxy
            ) as Buyers
        oversea.buy()
    }

    /**桥接模式*/
    private fun textBridging() {
        var uniform = Uniform()
        var shirt = Shirt()

        var coder = Coder()
        coder.setClothes(shirt)
        coder.dress()

        var student = Student()
        student.setClothes(uniform)
        student.dress()

        student.setClothes(shirt)
        student.dress()
    }

    /**外观模式*/
    private fun textOutside() {
        var gameSdk = GameSdk()
        gameSdk.login()
        gameSdk.pay(6)
    }

    /**享元模式*/
    private fun textFlyweight() {
        var factory: BikeFactory = BikeFactory()
        var ofo: IBike? = factory.getBike("ofo")
        ofo?.billing(2)
        var moBike: IBike? = factory.getBike("MoBike")
        moBike?.billing(1)

        var ofo1: IBike? = factory.getBike("ofo")
        ofo1?.billing(3)
    }

    /**装饰者模式*/
    private fun textDecorator() {
        var newRoom = NewRoom()
        var bedRoom = BedRoom(newRoom)
        bedRoom.fitment()

        var kitchen = KitRoom(newRoom)
        kitchen.fitment()
    }

    /**适配器模式*/
    private fun textAdapter() {
        /**对象适配器*/
        Log.e("model", "------对象适配器------")
        var electric = Electric()
        Log.e("model", "默认电压：${electric.output_220v()}")
        var phoneObjAdapter = PhoneObjAdapter(electric)
        Log.e("model", "适配器转换后的电压：${phoneObjAdapter.convert_5v()}")
        Log.e("model", "------类适配器------")
        /**类适配器*/
        var phoneClassAdapter = PhoneClassAdapter()
        Log.e("model", "适配器转换后的电压：${phoneClassAdapter.convert_5v()}")
    }

    /**组合模式*/
    private fun textCombination() {
        /**透明组合模式*/
        var root: TransPageElement = TransBranchesNode("网站页面")
        var music: TransPageElement = TransBranchesNode("音乐")
        var video: TransPageElement = TransBranchesNode("视频")
        var advertise: TransPageElement = TransLeafNode("广告")
        root.addPageElement(music)
        root.addPageElement(video)
        root.addPageElement(advertise)

        var chineseMusic: TransPageElement = TransBranchesNode("国语")
        var englishMusic: TransPageElement = TransBranchesNode("英语")
        music.addPageElement(chineseMusic)
        music.addPageElement(englishMusic)

        chineseMusic.addPageElement(TransLeafNode("十年.mp3"))
        englishMusic.addPageElement(TransLeafNode("Slow Down.mp3"))

        video.addPageElement(TransLeafNode("唐伯虎点秋香.mp3"))
        root.print("")

        /**安全组合模式*/
//        var root: SafeCombination.BranchesNode = SafeCombination.BranchesNode("网站页面")
//
//        var music = SafeCombination.BranchesNode("音乐")
//        var video = SafeCombination.BranchesNode("视频")
//        var advertise = SafeCombination.LeafNode("广告")
//
//        root.addPageElement(music)
//        root.addPageElement(video)
//        root.addPageElement(advertise)
//
//        var chineseMusic = SafeCombination.BranchesNode("国语")
//        var englishMusic = SafeCombination.BranchesNode("英语")
//        music.addPageElement(chineseMusic)
//        music.addPageElement(englishMusic)
//
//        chineseMusic.addPageElement(SafeCombination.LeafNode("十年.mp3"))
//        englishMusic.addPageElement(SafeCombination.LeafNode("Slow Down.mp3"))
//        video.addPageElement(SafeCombination.LeafNode("唐伯虎点秋香.mp3"))
//
//        root.print("")

    }

}