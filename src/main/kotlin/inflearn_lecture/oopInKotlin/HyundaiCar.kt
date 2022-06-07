package inflearn_lecture.oopInKotlin

// 추상화가 필요한 Entity or DTO에 sealed class 를 활용한다.
// 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
// 즉, 런타임때 클래스 타입이 추가될 수 없다.
sealed class HyundaiCar (
    val name: String,
    val price: Long
    )

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그렌저", 3_000L)

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}