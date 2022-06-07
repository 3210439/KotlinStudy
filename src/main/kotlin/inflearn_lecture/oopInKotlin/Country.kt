package inflearn_lecture.oopInKotlin


fun handleCountry(country: Country) {
    // country 값에 어떤 이넘 타입이 있는지 컴파일러가 알고 있기 때문에 else를 필요로 하지 않는다.
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

// when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우, 더욱더 진가를 발휘한다.
enum class Country (
    private val code: String,
        ){
    KOREA("KO"),
    AMERICA("US")
    ;
}