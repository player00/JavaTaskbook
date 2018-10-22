package Helpers

import java.util.*
import Helpers.lang.Ru.*

private val scan = Scanner(System.`in`)

fun isBetween(num: Int, min: Int, max: Int): Boolean {
    return num in min..max
}

private fun checkInt(): Int {
    while (!scan.hasNextInt()) {
        println(INCORRECT_INT)
        scan.next()
    }

    return scan.nextInt()
}

private fun checkInt(min: Int): Int {
    while (!scan.hasNextInt()) {
        println(INCORRECT_INT)
        scan.next()
    }

    var num = scan.nextInt()

    while (num < min) {
        println(INCORRECT_INT)
        num = scan.nextInt()
    }

    return num
}

private fun checkInt(min: Int, max: Int): Int {
    while (!scan.hasNextInt()) {
        println(INCORRECT_INT)
        scan.next()
    }

    var num = scan.nextInt()

    while (num !in min..max) {
        println(INCORRECT_INT)
        num = scan.nextInt()
    }

    return num
}

private fun checkDouble(): Double {
    while (!scan.hasNextDouble()) {
        println(INCORRECT_DOUBLE)
        scan.next()
    }

    return scan.nextDouble()
}

fun readDouble(): Double {
    println(READ_DOUBLE)

    return checkDouble()
}

fun readDouble(msg: String): Double {
    println(msg)

    return checkDouble()
}

fun readInt(): Int {
    println(READ_INT)

    return checkInt()
}

fun readInt(msg: String): Int {
    println(msg)

    return checkInt()
}

fun readInt(msg: String, min: Int, max: Int): Int {
    println("$msg в промежутке от $min до $max")

    return checkInt(min, max)
}

fun readNatural(): Int {
    println(READ_NATUTAL)

    return checkInt(1)
}