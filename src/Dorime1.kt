import java.lang.NumberFormatException

fun main()
{
    try {
        var x: Double
        var y: Double
        y = 0.0
        println("Введите значение x")
        x = readln().toDouble()
        when
        {
            (x <= 3) ->
            {
                y = Math.pow(x, 2.0) - 3*x+9
                print("Функция: F(x) = $y")
            }
            (x > 3) ->
            {
                y = 1/(Math.pow(x, 3.0) +6)
                print("Функция: F(x) = $y")
            }
        }
    }
    catch (e: NumberFormatException)
    {
        println("Введено не число")
    }
}