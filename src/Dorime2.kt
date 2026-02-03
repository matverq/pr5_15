import java.lang.NumberFormatException

fun main()
{
    try {
        var num: Int
        println("Введите число:")
        num = readln().toInt()
        if (num > 99 || num < 10)
        {
            println("Введено не двухзначное число")
        }
        else
        {
            when
            {
                num / 10 == 8   -> println("В числе содержится 8")
                num % 10 == 8   -> println("В числе содержится 8")
                else -> println("В числе не содержится 8")
            }
        }
    }
    catch (e: NumberFormatException)
    {
        println("Введено не число")
    }
}