package nagypal.kotlin
//look, my package does not have to match the folder

fun main(args: Array<String>) {
    println("Hello, Kotlin!")

    val foo = "Immutable string"

    val bar = "Template this: '$foo'"

    println(bar)
    printMessageWithPrefix(bar)
    printMessageWithPrefix(bar, "Debug")
    printMessageWithPrefix(prefix = "Warn", message = bar)

    val i = 41
    val answer = "The answer is ${i + 1}"
    printMessageWithPrefix(answer)
    printMessageWithPrefix("The square of 2 is ${square(2)}")

    var j = 41
    j = 42
    printMessageWithPrefix("$j")

    infixDemo()
    operatorOverloadDemo()

    varargsDemo()

    nullSafetyDemo()

    staticTypingDemo()

}

fun infixDemo() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ") //note, no parentheses

    //a built-in infix function
    val pair = "Ferrari" to "Katrina"
    println(pair)
}

fun operatorOverloadDemo() {
    // Not necessarily a good thing but may be useful for DSL
    // See https://kotlinlang.org/docs/reference/operator-overloading.html for a full list of available operators
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ") //note, no parentheses

}

fun varargsDemo() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "Szia")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) printMessageWithPrefix(m, prefix)
    }
    //This is not possible in Java!
    printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "Szia",
            prefix = "Greeting: "
    )

    //varargs are just arrays that can be passed with the start prefix
    fun log(vararg entries: String) {
        printAll(*entries)
    }

    val worksMsg = arrayOf("This", "works", "too!")
    log(*worksMsg)

}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//Single expression function
fun square(x: Int) = x * x

//same as above, but unnecessarily verbose
fun squareVerbose(x: Int): Int {
    return x * x
}