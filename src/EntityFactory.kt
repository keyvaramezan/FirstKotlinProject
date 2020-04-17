//lesson 4
/*interface Idprovider{
    fun getId(): String
}*/


//class Entity private constructor(val id:String){

    //lesson1
    /*companion object{
        fun create() = Entity("id")
    }*/
    //lesson 2
    /*companion object Factory{
        fun create() = Entity("id")
    }*/
    //lesson 4
    /*companion object Factory: Idprovider{

        override fun getId(): String {
            return "123"
        }

        const val id = "id"

        fun create() = Entity(getId())
    }
*/
//}


//fun main() {

    //lesson 1
    //val entity = Entity.Companion.create()
    //val entity = Entity.create()

    //lesson 2
    //val entity = Entity.Factory.create()

    //lesson 3
    /*val entity = Entity.Factory.create()
    entity.id*/

    //lesson 4
    /*val entity = Entity.Factory.create()
    entity.id*/

//}