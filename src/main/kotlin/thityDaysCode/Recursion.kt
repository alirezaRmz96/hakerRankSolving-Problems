package thityDaysCode

fun factorial(n : Int):Int{
    return if (n == 0 || n == 1){
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val n = readln().toInt()

    println(factorial(n))
}