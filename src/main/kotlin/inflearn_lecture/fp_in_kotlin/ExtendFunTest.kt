package inflearn_lecture.fp_in_kotlin

fun main(){
    val str = "ABC"
    println(str.lastChar())
}

// String 클래스의 확장 함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다!
// 멤버함수, 확장함수 중 멤버함수에 우선권이 있다!
// 확장함수는 현재 타입을 기준으로 호출된다.
// 확장 프로퍼티도 가능하다.


// 지역함수 예제
// depth가 깊어지고 코드가 깔끔하지 않음
/*
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}
*/