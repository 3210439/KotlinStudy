package inflearn_lecture.oopInKotlin

fun main() {
    val dto1 = PersonDto("최태현", 100)
    // toString이 붙어있기 때문에 내용이 정상적으로 출력된다.
    println(dto1)
}

// data 키워드를 붙여주면 equals, hashCode, toString을 자동으로 만들어 준다.
data class PersonDto(
    val name: String,
    val age: Int,
)