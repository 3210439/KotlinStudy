package chapter03

fun renamePackage(fullName: String, newName: String): String {
    val i = fullName.lastIndexOf('.')   // 마지막 . 위치를 찾음
    val prefix = if (i>=0) fullName.substring(0, i + 1) else return newName
    return prefix + newName
}

fun main() {
    println(renamePackage("foo.bar.old", "new")) // foo.bar.new
}