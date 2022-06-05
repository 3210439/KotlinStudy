package chapter04

class Person5(val firstName: String, val familyName: String = "") {
    fun fullName() = "$firstName $familyName"
}

class Room(vararg val persons5: Person5) {
    fun showNames() {
        for (person in persons5) println(person.fullName())
    }
}

fun main() {
    val room = Room(Person5("John"), Person5("Jane", "Smith"))
    room.showNames()
}