import Helpers.*

fun main(args: Array<String>) {
    var r = 0.0

    for (i in 1..3) {
        r += 1 / readDouble("Введите сопротивление $i")
    }

    println("Общее сопротивление = $r")
}
