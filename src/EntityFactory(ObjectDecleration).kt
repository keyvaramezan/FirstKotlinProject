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
    EASY, MEDIUM, HARD;

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
        }
        return Entity(id,name)
    }
}


class Entity (val id: String, val name: String){
    override fun toString(): String {
        return "id: $id, name: $name"
    }

}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    val mediumEnity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEnity)
}
//

