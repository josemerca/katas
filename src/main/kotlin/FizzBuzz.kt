fun main(args: Array<String>) {
    println("FizzBuzz Kata!")
    for (i in 1..100) {
        if ((i.mod(5) == 0) && (i.mod(3) == 0)) {
            println("FizzBuzz")
        }
        else if (i.mod(3) == 0) {
            println("Fizz")
        }
        else if (i.mod(5) == 0) {
            println("Buzz")
        }
        else {
            println(i)
        }
    }


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}