interface PersonInfoProvider {
    //lesson3
    /*fun printInfo(person: Person){
            println("basicInfoProvider")
            person.printInfo()
    }*/

    //lesson 4
    val providerInfo :String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}
//lesson 1
/*class BasicInfoProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
        println("printInfo")
    }
} */

//lesson 2
/*class BasicInfoProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
    }
}*/

//lesson3
/*class BasicInfoProvider : PersonInfoProvider{
    override fun printInfo(person: Person) {
        super.printInfo(person)
    }
}*/

//lesson 4
/*class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }
}*/

//lesson 5
interface SessionInfoProvider {
    fun getSessionId ():String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return  "Session"
    }
}
fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    checkTypes(provider)
}

//lesson 5
fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvider) {
        println("is not a session info provider")
    }else{
        println("is a session info provider")
        //(infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}

