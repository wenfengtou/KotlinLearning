package engineering

open class Fruit(val name: String)

class Orange(name: String): Fruit(name)

class Apple(name: String): Fruit(name)

interface Consumer<in T> {
    fun consume(item: T)
}

fun main() {
    val fruitConsumer: Consumer<Fruit> = object : Consumer<Fruit> {
        override fun consume(item: Fruit) {
            println("Consuming ${item.name}")
        }
    }

    //val appleConsumer: Consumer<Apple> = fruitConsumer

    val appleConsumer: Consumer<Apple> = object : Consumer<Apple> {
        override fun consume(item: Apple) {
            println("Consuming apple ")
        }
    }
//
//    val orangeConsumer: Consumer<Orange> = object : Consumer<Orange> {
//        override fun consume(item: Orange) {
//            println("Consuming ${item.name}")
//        }
//    }


    val apple = Apple("apple")
    val orange = Orange("Navel orange")

    appleConsumer.consume(apple)

    fruitConsumer.consume(apple)
//    fruitConsumer.consume(orange)

    //appleConsumer.consume(apple)
}


class GenericsTest {
    companion object {
        inline fun <reified T> printIfTypeMatch(item: Any){
            if (item is T){
                println(item)
            }
        }
    }
}