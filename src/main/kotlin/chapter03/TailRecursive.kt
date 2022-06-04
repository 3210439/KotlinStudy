package chapter03


/*
* tailrec을 붙이면 컴파일러가 재귀 함수를 비재귀적인 코드로 자동으로 변환해준다.
* 그 결과 양쪽의 장점, 즉 재귀 함수의 간결함과 비재귀 루프의 성능만을 취할 수 있다.
* */
tailrec fun binIndexOf(
    x: Int,
    array: IntArray,
    from: Int = 0,
    to: Int = array.size
): Int {
    if (from == to) return -1
    val midIndex = (from + to -1) / 2
    val mid = array[midIndex]
    return when {
        mid < x -> binIndexOf(x, array, mid+1, to)
        mid > x -> binIndexOf(x, array, from, midIndex)
        else ->midIndex
    }
}