import Helpers.*

fun main(args: Array<String>) {
    val n = readNatural()
    val m = readNatural()
    var sum = 0
    var x = 1

    for (i in 1..m + 1) {
        x *= 10
        sum += (n % x) / (x / 10)
    }

    println("Сумма равна: $sum")
}
