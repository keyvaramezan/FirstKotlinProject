interface PersonInfoProvider {
    val providerInfo :String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId ():String
}
//lesson 1
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    open protected val sessionIdPrefix = "session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return  sessionIdPrefix
    }
}
fun main() {
    val provider = FancyInfoProvider()
    //provider.sessionIdPrefix
    provider.printInfo(Person())
    checkTypes(provider)
}


fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvider) {
        println("is not a session info provider")
    }else{
        println("is a session info provider")
        //(infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}

