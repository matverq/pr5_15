import java.lang.NumberFormatException

fun main() {
    try
    {
        var num: Int
        println("Введите число: ")
        num = readln().toInt()
        when(num)
        {
            in 0..2  -> println("Младенец")
            in 3..6 -> println("Ребенок")
            in 7..15 -> println("Школьник")
            in 16..22 -> println("Студент")
            in 23..60 -> println("Взрослый")
            in 61..110 -> println("Пенсионер")
            !in 0..110 -> println("Не входит в интервал")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Введено не число")
    }
}