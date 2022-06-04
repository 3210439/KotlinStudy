package chapter03

import kotlin.random.Random

fun doWhileExam(){
    var sum = 0
    var num: Int

    do {
        num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

    println("Sum: $sum")
}

fun whileExam(){
    val num = Random.nextInt(1, 101)
    var guess = 0

    while (guess != num) {
        guess = readLine()!!.toInt()
        if (guess < num) println("Too small")
        else if (guess > num) println("Too big")
    }
    println("Right: it's $num")
}


fun main() {
    whileExam()
}