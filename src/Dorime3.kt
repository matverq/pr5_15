import java.lang.NumberFormatException

fun main() {
    try
    {
        var num: Int
        var num1: Int
        println("Введите возраст друга 1: ")
        num = readln().toInt()
        println("Введите возраст друга 2: ")
        num1 = readln().toInt()
        when(num)
        {
            in 7..16 -> println("У друга 1 школьный возраст")
            else -> println("Введён не подходящий возраст")
        }
        when(num1)
        {
            in 7..16 -> println("У друга 2 школьный возраст")
            else -> println("Введён не подходящий возраст")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Введено не число")
    }
}