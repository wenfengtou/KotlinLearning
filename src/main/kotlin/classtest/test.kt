package classtest

class Outer2 {
    private val message: String = "Hello, world!"

    inner class Inner {
        fun foo() = message
    }
}