package inflearn_lecture.moreFunc

fun main() {
    // continue, break를 사용할 수 없다.
    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1}
        .forEach{ number -> println(number)}

    // break 사용법
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    // continue 사용법
    numbers.forEach {
        number ->
        if (number == 2) {
            return@forEach
        }
    }
}