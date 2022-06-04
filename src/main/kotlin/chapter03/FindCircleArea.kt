package chapter03

import java.lang.Math.PI

fun circleArea2(radius: Double) = PI*radius*radius

fun circleArea(radius: Double): Double {
    //radius++
    return PI*radius*radius;
}

fun main() {
    print("Enter radius: ")
    val radius = readLine()!!.toDouble();
    println("Circle area: ${circleArea(radius)}")
    println("Circle area2: ${circleArea2(radius)}")
}