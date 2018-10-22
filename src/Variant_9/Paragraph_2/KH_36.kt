import Helpers.*

fun main(args: Array<String>) {
    val a = readDouble("Введите a")
    val b = readDouble("Введите b")
    val c = readDouble("Введите c")

    println("Неравенства " + (if (a < b && b < c) "" else "не ") + "выполняются")
}
