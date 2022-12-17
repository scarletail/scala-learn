package cn.scarletail

object Main {
    def main(args: Array[String]): Unit = {
        println("Hello world!")
        println(square(9))
    }

    def square(x: Int): Int = {
        x * x
    }
}