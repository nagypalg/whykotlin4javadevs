package nagypal.kotlin

fun nullSafetyDemo() {
    var neverNull: String = "This can't be null"
    println(neverNull)

    //This would not compile
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    println(nullable)

    //this works
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    println(inferredNonNull)

    //so this will not compile
    //inferredNonNull = null
}