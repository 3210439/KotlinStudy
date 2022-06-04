package chapter03

fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

fun main() {
    printSorted(6, 2, 10, 1)
    printSorted(6, 1, *intArrayOf(3, 8), 2) // 6, 1, 3, 8, 2 순서로 원소가 들어있는 배열이 전달되고, [1, 2, 3, 6, 8]이 반환됨
}