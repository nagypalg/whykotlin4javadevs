package nagypal

fun main(args : Array<String>) {
    println("Hello, Kotlin!")

    val foo = "Immutable string"

    val bar = "Template this: '$foo'"

    println(bar)
    printMessageWithPrefix(bar)
    printMessageWithPrefix(bar, "Debug")
    printMessageWithPrefix(prefix="Warn", message = bar)

    val i = 41
    val answer = "The answer is ${i + 1}"
    printMessageWithPrefix(answer)
    printMessageWithPrefix("The square of 2 is ${square(2)}")

    var j = 41
    j = 42
    printMessageWithPrefix("$j")

}

fun printMessageWithPrefix(message: String, prefix : String = "Info") {
    println("[$prefix] $message")
}

//Single expression function
fun square (x: Int) = x*x

//same as above, but unnecessarily verbose
fun squareVerbose (x: Int): Int {
    return x*x
}