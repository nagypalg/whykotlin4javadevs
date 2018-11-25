package nagypal.kotlin

fun staticTypingDemo() {
    var number = 3
    println("Number=$number")
    println("Number's type='${number::class}'")
    //the type is fixed, this is not valid
    //number = "foo"
    number = 42 //but this is
    println("Number=$number")
}