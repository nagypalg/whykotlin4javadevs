package nagypal.kotlin

fun nullSafetyDemo() {
    printBegin("nullSafetyDemo")

    var neverNull: String = "This can't be null"
    println(neverNull)
    println(neverNull.length)

    //This would not compile
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    println(nullable)
    //this will not compile because may lead to a null-pointer exception
    //println(nullable.length)

    //One alternative
    println(nullable?.length)

    //Or you can use a smart-cast
    if (nullable != null) {
        println(nullable.length)
    }

    //this works
    nullable = null
    println(nullable?.length)

    var inferredNonNull = "The compiler assumes non-null"
    println(inferredNonNull)

    //so this will not compile
    //inferredNonNull = null

    printEnd("nullSafetyDemo")
}