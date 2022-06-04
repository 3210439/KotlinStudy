package chapter03

fun main(){
    // 범위를 만드는 연산자 ..
    val chars = 'a'..'h'        // 'a'부터 'h'까지의 모든 문자
    val twoDigits = 10..99      // 10부터 99까지의 모든 수
    val zero2One = 0.0..1.0     // 0부터 1까지의 모든 부동소수점 수

    val num = readLine()!!.toInt()
    println(num in 10..99)  // num >= 10 && num <= 99
    println("def" in "abc".."xyz") // true
    println("zzz" in "abc".."xyz") // false

    val untilDigits = 10 until 100 // 10..99와 같음. 100은 포함되지 않음
    println(100 in untilDigits)

    println(5 in 5..5)          // true
    println(5 in 5 until 5)     // false
    println(5 in 10..1)         // false

    println(5 in 10 downTo 1)   // true
    println(5 in 1 downTo 10)   // false: 빈 진행임

    //val arr =  arrayOf(1..10 step 3);

    println(1..10 step 3)       // 1, 4, 7, 10
    println(15 downTo 9 step 2) // 15, 13, 11, 9

    println("Hello, World".substring(1..4))             // ello
    println("Hello, World".substring(1 until 4))        // ell
    println("Hello, World".substring(1, 4))                   // ell: substring(1 until 4)와 같음
    IntArray(10) { it*it }.sliceArray(2..5)        // 4, 9, 16, 25
    IntArray(10) { it*it }.sliceArray(2 until 5)   // 4. 9, 16


}