import Helpers.*

fun main(args: Array<String>) {
    val a = readDouble("Введите a")
    val b = readDouble("Введите b")
    val c = readDouble("Введите c")
    val d = readDouble("Введите d")

    println(if ((a <= c && b <= d) || (a <= d && b <= c)) "Можно" else "Нельзя")
}
