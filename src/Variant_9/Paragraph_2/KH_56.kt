import Helpers.*
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    val a = readDouble("Введите a")
    val b = readDouble("Введите b")
    val c = readDouble("Введите c")
    val x = readDouble("Введите x")
    val y = readDouble("Введите y")

    val min = min(min(a, b), c)
    val max = max(max(a, b), c)
    val mid = a + b + c - max - min

    println(if (min < min(x, y) && mid < max(x, y)) "Пройдёт" else "Не пройдёт")
}
