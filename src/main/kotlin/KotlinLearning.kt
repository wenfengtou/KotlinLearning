import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.io.File

data class User(var name:String = "", var age: Int = 10) {
    var address:String = ""
}
fun fetchData(): Flow<String> = flow {
    // 模拟从网络中获取数据
    for (i in 1..3) {
        delay(1000) // 模拟网络延迟
        emit("Data #$i")
    }
}

fun main() = runBlocking {
    println("Kotlin 版本：${KotlinVersion.CURRENT}")
    val inputFun:(String,)->Unit = {
        println("input $it")
    }


    val list1 = mutableListOf("33", "eee", "ddd")
    var(v1, v2) = list1

    list1.toString()
    println("input $v1")
    var nullString: String? = null
    nullString?.let {
        println("nidaye")
    }

    var yan = User().apply {
        name = "yan"
        age = 10
    }

    val str = "Hello, world!"
    var hki = str.also {
        println(it)
    }.substring(0, 5).also {
        println(it)
    }

    println("hki = $hki")

    var firstStr = nullString?.first()

    println("firstStr = $firstStr")

    inputFun("haha")
    // 创建一个 Flow
    val flow = fetchData()

    // 使用 collect 操作符来订阅并处理 Flow 中的数据
    flow.collect { data ->
        println(data)
    }



    println("Completed")
}
