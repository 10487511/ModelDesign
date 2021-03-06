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

    /**???????????????*/
    private fun testObserver() {
        val postMan: Observable = PostMan()

        val boy1 = Boy("????????????")
        val boy2 = Boy("???????????????")
        val girl = Girl("?????????")

        postMan.add(boy1)
        postMan.add(boy2)
        postMan.add(girl)

        postMan.notify("???????????????????????????????????????")
    }

    /**????????????*/
    private fun testSingleton() {
        /**?????????*/
//        Singleton.showSomeThing(this@MainActivity)
        /**?????????*/
//        Singleton.get().showSomeThing(this@MainActivity)
        /**????????????????????????*/
//        Singleton.get().showSomeThing(this@MainActivity)
        /**???????????????*/
//        Singleton.instance.showSomeThing(this@MainActivity)
        /**???????????????*/
//        Singleton.instance.showSomeThing(this@MainActivity)
        /**???????????????(???????????????)*/
        Singleton.getInstance(5).showSomeThing(this@MainActivity)
    }

    /**???????????????*/
    private fun testBuilder() {
        val builder: Builder = ConcreteBuilder()
        val director: Director = Director(builder)
        director.construct(
            "i7-11500K",
            "??????DDR4 32g",
            "??????2TB"
        )
        director.showMessage(this@MainActivity)
    }

    /**??????????????????*/
    private fun testFactory() {
        val factoryA: Factory = FactoryA()
        val productA = factoryA.create()
        productA.show(this@MainActivity)

        val factoryB: Factory = FactoryB()
        val productB = factoryB.create()
        productB.show(this@MainActivity)
    }

    /**????????????????????????*/
    private fun testSimpleFactory() {
//        com.model.design.simplefactorymodel.Factory.create("A")?.show(this@MainActivity)
//        com.model.design.simplefactorymodel.Factory.create("B")?.show(this@MainActivity)
        //????????????C  ??????????????????show???
        com.model.design.simplefactorymodel.Factory.create("C")?.show(this@MainActivity)
        com.model.design.simplefactorymodel.Factory.create1(com.model.design.simplefactorymodel.ProductA::class.java)
            ?.show(this@MainActivity)
    }

    /**??????????????????*/
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

    /**????????????*/
    private fun testPrototype() {
        val card1: Card = Card()
        card1.num = 8527
        card1.setSpec(10, 20)
        Log.e("model", card1.toString())

        val card2: Card = card1.clone()
        Log.e("model", card2.toString())
    }

    /**????????????*/
    private fun testStrategy() {
        var areaContext: AreaContext = AreaContext(ShoppingStrategy())
        areaContext.chase()

        areaContext = AreaContext(MoviesStrategy())
        areaContext.chase()
    }

    /**????????????*/
    private fun textState() {
        var environment = EnvironmentUse()
        environment.doublePerson()
        environment.shopping()
        environment.movies()
        environment.singlePerson()
        environment.shopping()
        environment.movies()
    }

    /**???????????????*/
    private fun textResponsibility() {
        var beijingPostman = BeijingPostman()
        var shanghaiPostman = ShanghaiPostman()
        var chongqingPostman = ChongqingPostman()

        beijingPostman.nextPostman = shanghaiPostman
        shanghaiPostman.nextPostman = chongqingPostman

        Log.e("mode", "????????????????????????????????????")
        beijingPostman.handleCourier("Shanghai")
        Log.e("model", "????????????????????????????????????")
        beijingPostman.handleCourier("Guangzhou")
        Log.e("model", "????????????????????????????????????")
        beijingPostman.handleCourier("America")
    }

    /**??????????????????*/
    private fun textTemplateMethod() {
        Log.e("model", "----??????A----")
        var postA: TemplatePostman = PostA()
        postA.post()
        Log.e("model", "----??????B----")
        var postB: TemplatePostman = PostB()
        postB.post()
    }

    /**???????????????*/
    private fun textIterator() {
        var aggregate: Aggregate = DeliveryAggregate()
        aggregate.addNum("1111")
        aggregate.addNum("2222")
        aggregate.addNum("3333")
        aggregate.addNum("9527")

        var iterator = aggregate.iterator()
        while (iterator.hasNext()) {
            var tel = iterator.next()
            Log.e("model", "??????????????? $tel")
        }
        Log.e("model", "????????????")
    }

    /**???????????????*/
    private fun textMemorandum() {
        Log.e("model", "????????????Game")
        var game: Game = Game()
        game.play()
        var memento: Memento = game.createMemento()
        var caretaker: Caretaker = Caretaker()
        caretaker.mMemento = memento
        game.exit()

        Log.e("model", "????????????Game")
        var secondGame = Game()
        secondGame.setMemento(caretaker.mMemento!!)
        secondGame.play()
        secondGame.exit()
    }

    /**???????????????*/
    private fun textVisitor() {
        var wanYiYun: Music = Music("?????????")
        var kuGou: Music = Music("??????")
        var youKu: Video = Video("??????")
        var iQiYi: Video = Video("?????????")

        var websites = Websites()
        websites.addWeb(wanYiYun)
        websites.addWeb(kuGou)
        websites.addWeb(youKu)
        websites.addWeb(iQiYi)

        var idler = Idler("??????")
        websites.accept(idler)
    }

    /**???????????????*/
    private fun textMediator() {
        var lianJia = LianJia()
        var purchaser = Purchaser(lianJia)
        var landlord = Landlord(lianJia)
        lianJia.setLandlord(landlord)
        lianJia.setPurchaser(purchaser)

        landlord.send("??????????????????")
        purchaser.send("?????????????????????")
    }

    /**???????????????*/
    private fun textInterpreter() {
        var calculator = Calculator()
        calculator.read("a = 1024")
        calculator.read("b = 512")
        Log.e("model", "a = 1024")
        Log.e("model", "b = 512")
        //read????????????????????????Calculator?????????????????????
        calculator.read("a + b")
        Log.e("model", "a+b=${calculator.calculate()}")
        calculator.read("a - b")
        Log.e("model", "a-b=${calculator.calculate()}")
    }

    /**????????????*/
    private fun textOrder() {
        var receiver = Receiver()
        var command = ShutdownCommand(receiver)
        var invoker = Invoker(command)
        invoker.action()
    }

    /**????????????*/
    private fun textProxy() {
        //????????????
//        var domestic: Buyers = Domestic()
//        var oversea: Buyers = Oversea(domestic)
//        oversea.buy()
        //???????????????DynamicProxy???????????????  ???????????????
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

    /**????????????*/
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

    /**????????????*/
    private fun textOutside() {
        var gameSdk = GameSdk()
        gameSdk.login()
        gameSdk.pay(6)
    }

    /**????????????*/
    private fun textFlyweight() {
        var factory: BikeFactory = BikeFactory()
        var ofo: IBike? = factory.getBike("ofo")
        ofo?.billing(2)
        var moBike: IBike? = factory.getBike("MoBike")
        moBike?.billing(1)

        var ofo1: IBike? = factory.getBike("ofo")
        ofo1?.billing(3)
    }

    /**???????????????*/
    private fun textDecorator() {
        var newRoom = NewRoom()
        var bedRoom = BedRoom(newRoom)
        bedRoom.fitment()

        var kitchen = KitRoom(newRoom)
        kitchen.fitment()
    }

    /**???????????????*/
    private fun textAdapter() {
        /**???????????????*/
        Log.e("model", "------???????????????------")
        var electric = Electric()
        Log.e("model", "???????????????${electric.output_220v()}")
        var phoneObjAdapter = PhoneObjAdapter(electric)
        Log.e("model", "??????????????????????????????${phoneObjAdapter.convert_5v()}")
        Log.e("model", "------????????????------")
        /**????????????*/
        var phoneClassAdapter = PhoneClassAdapter()
        Log.e("model", "??????????????????????????????${phoneClassAdapter.convert_5v()}")
    }

    /**????????????*/
    private fun textCombination() {
        /**??????????????????*/
        var root: TransPageElement = TransBranchesNode("????????????")
        var music: TransPageElement = TransBranchesNode("??????")
        var video: TransPageElement = TransBranchesNode("??????")
        var advertise: TransPageElement = TransLeafNode("??????")
        root.addPageElement(music)
        root.addPageElement(video)
        root.addPageElement(advertise)

        var chineseMusic: TransPageElement = TransBranchesNode("??????")
        var englishMusic: TransPageElement = TransBranchesNode("??????")
        music.addPageElement(chineseMusic)
        music.addPageElement(englishMusic)

        chineseMusic.addPageElement(TransLeafNode("??????.mp3"))
        englishMusic.addPageElement(TransLeafNode("Slow Down.mp3"))

        video.addPageElement(TransLeafNode("??????????????????.mp3"))
        root.print("")

        /**??????????????????*/
//        var root: SafeCombination.BranchesNode = SafeCombination.BranchesNode("????????????")
//
//        var music = SafeCombination.BranchesNode("??????")
//        var video = SafeCombination.BranchesNode("??????")
//        var advertise = SafeCombination.LeafNode("??????")
//
//        root.addPageElement(music)
//        root.addPageElement(video)
//        root.addPageElement(advertise)
//
//        var chineseMusic = SafeCombination.BranchesNode("??????")
//        var englishMusic = SafeCombination.BranchesNode("??????")
//        music.addPageElement(chineseMusic)
//        music.addPageElement(englishMusic)
//
//        chineseMusic.addPageElement(SafeCombination.LeafNode("??????.mp3"))
//        englishMusic.addPageElement(SafeCombination.LeafNode("Slow Down.mp3"))
//        video.addPageElement(SafeCombination.LeafNode("??????????????????.mp3"))
//
//        root.print("")

    }

}