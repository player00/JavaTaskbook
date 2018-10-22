import Helpers.*
import java.lang.Math.pow

fun main(args: Array<String>) {
    val n = readNatural()
    var sum = 0.0

    for (i in 1..n) {
        sum += 1 / pow(i.toDouble(), 5.0)
    }

    println("Сумма равна: $sum")
}
