package org.example


open class Warrior() {
    var health: Int = 50
    open var attack: Int = 5

    val isAlive: Boolean
        get() = health > 0

//    fun isAlive(): Boolean {
//        return health > 0
//    }
}

class Knight() : Warrior() {
    override var attack = 7
}

class Army() {
    val armyList = mutableListOf<Warrior>()


    fun addUnits(quantity: Int, type: () -> Warrior) {

        for (i in 1..quantity) {
            armyList.add(type())
        }

        for (i in armyList) {
            println(i.attack)

        }


    }
}

fun fight(knight: Warrior, warrior: Warrior) {
    var isKnightTurnToDefense = true

    while (knight.isAlive && warrior.isAlive) {

        if (isKnightTurnToDefense) knight.health -= warrior.attack
        else warrior.health -= warrior.attack
        isKnightTurnToDefense = !isKnightTurnToDefense
        println("knight health ${knight.health} warrior health ${warrior.health}")
    }

//    if (knight.isAlive) println("Knight won")
//    if (warrior.isAlive) println("Warrior won")


}


fun fight(army1: Army, army2: Army) {

    val army1Copy = army1
    val army2Copy = army2


    for ((index, value) in army1Copy.armyList.withIndex()) {



    }


}

fun main() {

    val army1 = Army()

    army1.addUnits(5) { Warrior() }
    army1.addUnits(2) { Knight() }


}