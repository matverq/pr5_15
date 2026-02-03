import java.lang.NumberFormatException

fun main() {
    try
    {
        var num:Double
        var num1:Double
        println("Введите число:")
        num= readln().toDouble()
        println("Введите число:")
        num1= readln().toDouble()
        if (num > num1)
        {
            num+1
        }
        if (num1 > num)
        {
            num1+1
        }
        if (num1 == num)
        {
           num = Math.pow(num, 3.0)

        }
        println("итоговые значения: $num и $num1")
    }
    catch (e:NumberFormatException)
    {
        println("Введено не число")
    }
}