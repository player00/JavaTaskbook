import Helpers.*

fun main(args: Array<String>) {
    val age = readInt("Введите возраст", 0, 100)
    var text = "лет"

    if (age in 11..15) {
        text = "лет"
    } else {
        when (age % 10) {
            1 -> text = "год"
            2, 3, 4 -> text = "года"
        }
    }

    println("$age $text")
}
