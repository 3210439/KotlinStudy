package inflearn_lecture.moreFunc

fun main() {
    // 라벨을 사용한 Jump는 사용하지 않는 것이 좋음
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }
}