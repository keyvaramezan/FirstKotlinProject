fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemTogreeting ->
        println("$greeting $itemTogreeting")
    }
}
//lesson 3
//fun greetPerson(greeting: String, name: String) =  println("$greeting, $name")

//lesson4
fun greetPerson(greeting: String = "Hello", name: String = "Keyvan")=println("$greeting $name")

fun main() {

    //lesson 1
       /*val interstingThings = listOf("Kotlin","Programming","ComicBooks")
        sayHello("Hi", "Kotlin","Programming","Comic Books" )*/

    //lesson2
    /*val interstingThings = arrayOf("Kotlin","Programming","ComicBooks")
    sayHello("Hi", *interstingThings)*/

    //lesson3
    //greetPerson(name = "keyvan", greeting = "Hi")

    //lesson 4
    //greetPerson()


    //lesson 5
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello(itemsToGreet = *interestingThings,greeting = "Hello")
}