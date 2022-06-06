package inflearn_lecture.oopInKotlin

fun main() {
    Person()
}

class Person(
    val name: String,
    val age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }
}