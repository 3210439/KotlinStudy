package inflearn_lecture.chapter01


// null이 아닌 경우에만 호출되는 Safe Call (?.) 이 있다
// :? 연산자를 Elvis 라고 부르는데 이유는 :?를 우측으로 90도 회전한 모양이
// Elvis라는 사람의 헤어스타일과 닮았기 때문이라고 한다.
// Elvis 연산자를 통해서 null 값일 경우 ?: 우측에 식을 실행시킨다.
// null이 절대 아닐때 사용할 수 있는 널 아님 단언 (!!) 이 있다.

// null일 경우 Exception을 발생한다.
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

// null일 경우 null을 리턴 리턴 타입을 자세히 보면 Boolean?으로 되어있다.
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

// null일 경우 false를 리턴
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// 파라미터에 null을 허용할 수 없어 !!
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}