fun main(args: Array<String>) {
    println("Hello World!")
    var n: Int = 5
    var w: Int = 2
    println(sum(n, w))
    n = 6
    println(n)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun sum(a: Int, b: Int) : Int {
    return a + b
}