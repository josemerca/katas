package katas

fun main(args: Array<String>) {
    println("FizzBuzz Kata!")
    val range = 1..100
    range.map { FizzBuzz(it) }
}

fun FizzBuzz(item : Int) {
    when (true) {
        (item.mod(15) == 0) -> println("FizzBuzz")
        (item.mod(3) == 0) -> println("Fizz")
        (item.mod(5) == 0) -> println("Buzz")
        else -> println(item)
    }
}