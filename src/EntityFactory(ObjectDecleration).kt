import java.util.*

//lesson 1
/*
object EntityFactory{
    fun create() = Entity("id")
}

class Entity (val id: String){


}

fun main() {
    val entity = EntityFactory.create()
}*/

//lesson 2
/*
object EntityFactory{
    fun create() = Entity("id", "name")
}

class Entity (val id: String, val name: String){
    override fun toString(): String {
        return "id: $id, name: $name"
    }

}

fun main() {
    val entity = EntityFactory.create()
    println(entity)
}*/


//Enum Classes lesson 1

enum class EntityType{
    Help, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory{
    fun create(type: EntityType) : Entity{
        val id = UUID.randomUUID().toString();
        val name = when(type){
            //EntityType.EASY -> "Easy"
            EntityType.EASY -> type.name
            //EntityType.MEDIUM -> "Medium"
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"

            // lesson1 for sealed Class
            EntityType.Help -> type.getFormattedName()
        }
        //return Entity(id,name)

        //lesson 1 for Sealed Class
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.Help -> Entity.Help
        }
    }
}


/*class Entity (val id: String, val name: String){
    override fun toString(): String {
        return "id: $id, name: $name"
    }

}*/


//lesson 1 for Sealed Class
sealed class Entity (){
    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) :Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}


fun main() {
    val entity: Entity = EntityFactory.create(EntityType.Help)

    // lesson for enum class
   /* println(entity)
    val mediumEnity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEnity)*/

    // lesson 1 for sealed class
    val msg = when(entity){
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard -> "hard class"
    }

    println(msg)
}
//

