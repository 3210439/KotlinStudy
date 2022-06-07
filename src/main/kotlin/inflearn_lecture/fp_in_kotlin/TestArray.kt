package inflearn_lecture.fp_in_kotlin

fun main() {
    // array 생성 방법
    val array = arrayOf(100, 200)

    // 배열에 인덱스로 접근하는 방법
    for (i in array.indices){
        println("${i} ${array[i]}")
    }

    // 배열에 인덱스와 값에 한번에 접근하는 방법
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }
}