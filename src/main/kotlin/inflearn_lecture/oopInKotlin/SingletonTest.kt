package inflearn_lecture.oopInKotlin

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person1 private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person1 {
            return Person1(name, MIN_AGE)
        }
    }
}

object Singleton {
    var a: Int = 0
}