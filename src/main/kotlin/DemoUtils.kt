package nagypal.kotlin

fun printBegin(name: String) {
    printWithSeparator(name, "BEGIN")
}

fun printEnd(name: String) {
    printWithSeparator(name, "END")
}

fun printWithSeparator(name: String, position: String, separatorChar: String = "#") {
    val separator = separatorChar.repeat(name.length + position.length + 1)
    println("""
        |
        |$separator
        |$name $position
        |$separator
        |
    """.trimMargin())
}