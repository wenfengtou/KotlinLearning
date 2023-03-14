package classtest

class Outer {
    private val message: String = "Hello, world!"

    class Nested {
        fun foo() = "Welcome to Kotlin"
    }
}

fun main() {
    val nested = Outer.Nested()
    println(nested.foo())
}
