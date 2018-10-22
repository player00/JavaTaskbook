import Helpers.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val x = abs(readDouble("Введите x"))
    val y = abs(readDouble("Введите y"))

    println(if (x <= 0.5 && y <= 1) "Принадлежит" else "Не принадлежит")
}
