package inflearn_lecture.moreFunc

import inflearn_lecture.fp_in_kotlin.Fruit

// Type Alias와 as import
typealias FruitFilter = (Fruit) -> Boolean

// 이름 긴 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있다.
data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

// as import : 어떤 클래스나 함수를 임포트 할 때 이름을 바꾸는 기능
// import com.lannstark.lec19.a.printHelloWorld as printHelloWorldA
// import com.lannstark.lec19.b.printHelloWorld as printHelloWorldB
// 위 처럼 함수명이 같을 때 as import를 활용할 수 있다.

// 구조분해: 복합적인 값을 분해하여 여러 변수를 한 번에 초기화하는 것
// 구조분해 문법을 사용한다는 것은 componentN 문법을 사용하는 것이다.
// val (name, age) = person

data class Person(
    val name: String,
    val age: Int,
)

fun main () {
    val person = Person("최태현", 100)
    val (name, age) = person
    println("${name} , ${age}")
    // 위 구조분해 함수와 밑의 componentN 함수는 같은 함수이다.
    // val name = person.component1()
    // val age = person.component2()
}