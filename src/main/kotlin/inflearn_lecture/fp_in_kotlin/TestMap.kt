package inflearn_lecture.fp_in_kotlin

fun main(){

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 불변맵 초기화 방법
    // mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, vlaue) in oldMap.entries){

    }
}