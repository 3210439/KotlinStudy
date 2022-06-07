package inflearn_lecture.fp_in_kotlin

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다란 익명 함수

    // 함수의 타입: (파라미터 타입...) -> 반환 타입
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    // 람다를 직접 호출하는 방법 1
    println(isApple(fruits[0]))

    // 람다를 직접 호출하는 방법 2
    println(isApple.invoke(fruits[0]))

    // 마지막 파라미터가 함수인 경우, 소괄호 밖에 람다 사용 가능하다.(추천)
    println(filterFruits(fruits) {fruit -> fruit.name == "사과"})

    // 파라미터가 하나일 경우 아래와 같이 it을 사용할 수 있다.(비추)
    println(filterFruits(fruits) {it.name == "사과"})

    // tip : 람다를 여러줄 작성할 수 있고, 마지막 줄의 결과가 람다의 반환값이다.
}

// 코틀린에서는 함수를 파라미터로 받을 수 있다.
// filter: (Fruit) -> Boolean 의미는 Fruit를 파라미터로 밭고 Boolean 타입을 리턴하는 함수를 변수로 받겠다고 명시한 것이다.
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit>{
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}


