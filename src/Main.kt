fun main() {
    println("First number:")
    val num1 = readLine()!!.toDouble()

    println("Second number:")
    val num2 = readLine()!!.toDouble()

    println("Choose an operation (+, -, *, /):")
    val operation= readLine()!!

    when (operation) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> {
            if (num2 == 0.0) {
                println("Division by zero is not allowed")
            }
            else{
                println(num1 / num2)
            }
        }
        else -> println("Invalid operation")
    }
}
