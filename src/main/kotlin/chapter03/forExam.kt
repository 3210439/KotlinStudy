package chapter03


fun forExam1(a: IntArray){
    var sum = 0

    // 루프 변수는 불변 값이다.
    for (x in a) {
        sum += x
    }

    println("Sum: $sum")
}

fun forExam2(a: IntArray){
    for (i in 0..a.lastIndex){
        if (i % 2 == 0){
            a[i] *= 2
        }
    }
}

fun forExam3(a: IntArray){
    for (i in a.indices step 2){
        a[i] *= 2
    }
}

fun main() {
    val a = IntArray(10) { it*it }  // 0, 1, 4, 9, 16, ...
    forExam1(a)
    forExam2(a)
    forExam3(a)
}