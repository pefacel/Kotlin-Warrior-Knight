package org.example

open class Figure(val name: String) {

}

class Rectangle(name: String) : Figure(name) {

}

interface Clickeable {
    fun click()
    fun show() = println("I'm clikceable")
}


class Button : Clickeable {
    override fun click() {
        println("Click en botón")
    }

}

open class RichButton : Clickeable {
    fun disable() {}

    open fun animate() {}

    override fun click() {
        TODO("Not yet implemented")
    }
}


class ThemedButton():RichButton(){
    override fun animate() {
        super.animate()
        println("Custom animation")
    }
}

fun main() {
    Button().click()
    Button().show()
    ThemedButton().animate()
}

