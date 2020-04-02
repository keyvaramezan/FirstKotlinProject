val name = "keyvan"
var greeting: String? = null


/*fun main() {
    greeting = "hello"
when(greeting){
    null -> println("hi")
    else -> println(greeting)
}
    println(name)


} */
/*fun main() {
    greeting = "Hello"
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
} */

fun main() {
    greeting = "Hello"
    val greetingToPrint = when (greeting){
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}