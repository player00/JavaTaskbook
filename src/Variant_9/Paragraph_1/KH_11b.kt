import Helpers.*

fun main(args: Array<String>) {

    val x = readDouble("Введите x")
    val y = readDouble("Введите y")
    val z = readDouble("Введите z")

    val a = (3 + Math.exp(y - 1)) / (1 + x * x * Math.abs(y - Math.tan(z)))
    val b = 1 + Math.abs(y - x) + Math.pow(y - x, 2.0) / 2 + Math.pow(Math.abs(y - x), 3.0) / 3

    println("a = $a b = $b")
}
