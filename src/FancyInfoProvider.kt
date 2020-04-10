//lesson 1
class FancyInfoProvider : BasicInfoProvider(){

    override val sessionIdPrefix: String
        get() = "Fancy Sesssion"

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}

//lesson 1
fun main() {
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
}