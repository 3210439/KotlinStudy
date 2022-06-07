package inflearn_lecture.fp_in_kotlin

fun main() {
    val numbers = listOf<Int>(100, 200)
    val empty = emptyList<Int>()

    // 가변 : Mutable
    // 가변(Mutable) 리스트를 만들고 싶다면?!!
    // val Mutable_numbers = mutableListOf(100, 200)
    // numbers.add(300)

    // 집합 선언 방법 val numbers = setOf(100, 200)
    // 가변 집합 val numbers = mutableSetOf(100, 200)

    // 추론 가능하기에 에러 x
    printNumbers(emptyList())

    println(numbers[0])

    for(number in numbers){
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}

private fun printNumbers(numbers: List<Int>){

}