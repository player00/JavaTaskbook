import Helpers.*
import java.util.*

private val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    println(scan.next().toLowerCase())
    println(scan.next().toUpperCase())
    println(scan.next())
    val n = readInt("Введите натуральное число", 1, 9999)
    val x1 = n / 1000 % 10
    val x2 = n / 100 % 10
    val x3 = n / 10 % 10
    val x4 = n % 10

    println(if (x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4) "Все различны" else "Не все различны")
}

