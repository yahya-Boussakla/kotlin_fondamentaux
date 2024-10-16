package com.example.fondamentaux.tutos

fun main() {


    class Circle(val radius:Double) {
        constructor(name:String) : this(1.0)
        constructor(diameter:Int) : this(diameter / 2.0) {
            println("in diameter constructor")
        }
        init {
            println("Area: ${3 * radius * radius}")
        }
    }
    val c = Circle("yqhyq")
}
