package chapter04

class InnerPerson(val firstName: String, val familyName: String) {
    inner class Possession(val description: String) {
        fun showOwner() = println(fullName())
    }
    private fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = InnerPerson("John", "Doe")
    // Possession 생성자 호출
    val wallet = person.Possession("Wallet")
    wallet.showOwner() // John Doe
}

