import Helpers.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val a = readDouble()
    val n = readNatural()
    var mul = a
    for (i in 1 until n) {
        mul += a + i
    }

    println("Произведение равно: $mul")
}
