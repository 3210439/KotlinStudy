package chapter03



fun numberDescription(n: Int): String = when {
    n == 0 -> "Zero"
    n == 1 || n == 2 || n == 3 -> "Small"
    n in 4..9 -> "Medium"
    n in 10..100 -> "Large"
    n in Int.MIN_VALUE until 0 -> "Negative"
    else -> "Huge"
}

fun numberDescription_n(n: Int, max: Int = 100): String = when (n) {
    0 -> "Zero"
    1, 2, 3 -> "Small"
    in 4..9 -> "Medium"
    in 10..max -> "Large"
    in Int.MIN_VALUE until 0 -> "Negative"
    else -> "Huge"
}

fun main(){
    println("numberDescription: ${numberDescription_n(max = 555, n = -1)}")}