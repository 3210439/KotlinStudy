package inflearn_lecture.moreFunc


// 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
// takeUnless의 경우 반대이다.
//fun getNumberOrNullV2(): Int? {
//    return number.takeIf { it > 0}
//}


/*
* * 타입에 대한 별칭을 줄 수 있는 typealias 라는 키워드가 존재한다.
* Import 당시 이름을 바꿀 수 있는 as import 기능이 존재한다.
* 변수를 한 번에 선언할 수 있는 구조분해 기능이 있으며 componentN 함수를 사용한다.
* for문, while문과 달리 forEach에는 break와 continue를 사용할 수 없다.
* takeif와 takeUnless를 활용해 코드양을 줄이고 method chaning을 활용할 수 있다.
* */