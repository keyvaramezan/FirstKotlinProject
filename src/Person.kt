//lesson 1
//class Person

//lesson 2
/*class Person (_firstName: String, _lastName: String){
    val firstName : String
    val lastName: String
    init {
        firstName = _firstName
        lastName = _lastName
    }
}*/

//lesson 2
/*class Person (_firstName: String, _lastName: String) {
    val firstName = _firstName
    val lastName = _lastName
}*/

//lesson 2
/*class Person (_firstName: String, _lastName: String) {
    val firstName = _firstName
    val lastName = _lastName
}*/

//lesson 2
//class Person (val firstName: String, val lastName: String)

//lesson 3
/*class Person (val firstName: String, val lastName: String){

    init {
        println("init 1")
    }

    constructor(): this("Beri","Alen"){
        println("secondary constructor")
    }

    init {
        println("init 2")
    }
}*/

//lesson 4
class Person (val firstName: String = "Beri", val lastName: String = "Alen"){

    var nickName: String? = null
    set(value) {
        field = value
        println("the new nikname is $value")
    }
    get(){
        println("the returned value is $field ")
        return field
    }

    //lesson 5
    fun printInfo(){
        //val niknameToPrint = if (nickName != null) nickName else "no nickname"
        val niknameToPrint = nickName ?: "no nickname"
        println("$firstName ($niknameToPrint) $lastName")
    }

}

//visibility
    //public access from out of class
    //internal access in this module
    //protected access in this class and subClasses
    //private access in this class