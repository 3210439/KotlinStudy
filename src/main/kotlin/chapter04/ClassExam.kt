package chapter04

class Person(val firstName: String, familyName: String) {
    // firstName은 생성자 파라미터를 가리킴
    val fullName = "$firstName $familyName"

    fun printFirstName() {
        println(firstName)  // firstName은 멤버 프로퍼티를 가르킴킴
   }
}
class Person1(val firstName: String, val familyName: String = "") {

}
class Person2(val firstName: String, val familyName: String = "")



fun main() {
    val person = Person("John", "Doe")
    println(person.firstName)   // firstName은 프로퍼티를 가리킴
    val person1 = Person1("John", "Doe")
    println(person1.firstName)   // firstName은 프로퍼티를 가리킴
    val person2 = Person2("John", "Doe")
    println(person2.firstName)   // firstName은 프로퍼티를 가리킴
}