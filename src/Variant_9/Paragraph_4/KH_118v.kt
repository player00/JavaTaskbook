fun main(args: Array<String>) {
    var sum = 0.0
    var sign = 1

    var str = "asd"
    println(str.substring(1))
    for (i in 10000 downTo 1) {
        sum += sign * 1.0 / i.toDouble()
        sign *= -1
    }

    println("Сумма равна: $sum")
}
