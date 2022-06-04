package chapter03

import kotlin.random.Random


fun countLetters(text: String): IntArray {
    val counts = IntArray('z' - 'a' + 1)

    for (char in text) {
        val charLower = char.toLowerCase()
        if (charLower !in 'a'..'z') continue
        counts[charLower - 'a']++
    }

    return counts
}

fun implied() {
    val num = Random.nextInt(1, 101)

    loop@ while (true) {
        val guess = readLine()!!.toInt()

        val message = when {
            guess < num -> "Too small"
            guess > num -> "Too big"
            else -> break@loop
        }
        println(message)
    }
    println("Right: it's $num")
}

fun main(){
    implied()
}