package week1

open class Human(open val name: String = "Scolley31", var mana:Boolean = true) {
    open fun attack() {
        println("$name use First Attack!")
    }
}

class Mage ():Human(){
    override fun attack(){
        println("$name use Fireball!")
    }
}

fun main(){
    val human = Human()
    human.attack() //Q3 answer

    println("Does human have mana? " + human.mana) //Q6 answer

    val mage = Mage()

    mage.attack() //Q5 answer

}