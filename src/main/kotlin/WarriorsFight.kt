package org.example


open class Warrior() {
    var health: Int = 50
    open var attack: Int = 5
    fun isAlive(): Boolean {
//        return if (health > 0) {
//            true
//        } else {
//            false
//        }
        return health > 0
    }
}

class Knight() : Warrior() {
    override var attack = 7
}

fun fight(knight: Knight, warrior: Warrior) {
    var knight = Knight()
    var warrior = Warrior()
    var isKnightTurn: Boolean = false

    while (!knight.isAlive() || !warrior.isAlive()) {


    }

}

fun main() {

    var knight: Knight = Knight()
    var warrior: Warrior = Warrior()


}