fun sayHello(greeting:String, itemsToGreet:List<String> ) {
    itemsToGreet.forEach {itemTogreeting ->
        println("$greeting $itemTogreeting")
    }
}


fun main() {

    //val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    //println(interestingThings.size)
    //println(interestingThings[0])
    //println(interestingThings.get(0))

    /*for (interestingThing in interestingThings) {
        println(interestingThing)
    }*/
    /*interestingThings.forEach {
        println(it)
    }*/
    /*interestingThings.forEach {interestingThing ->
        println(interestingThing)
    }*/
    /*interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }*/
    /*val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }*/
    /*val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    interestingThings.add("dog")

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }
    map.put()*/
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", interestingThings)
}