import Helpers.*
import java.lang.Math.pow
import java.lang.Math.sqrt

fun main(args: Array<String>) {
    val x1 = readDouble("Введите x1")
    val y1 = readDouble("Введите y1")
    val x2 = readDouble("Введите x2")
    val y2 = readDouble("Введите y2")

    println("Расстояние = ${sqrt(pow(x2 - x1, 2.0) + pow(y2 - y1, 2.0))}")
}
