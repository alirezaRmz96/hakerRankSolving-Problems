package thityDaysCode

fun main(args: Array<String>) {
    val N = readln().trim().toInt()

    if (N % 2 != 0)
        println("Weird")
    if (N % 2 == 0) {
        if (N in 2..5)
            println("Not Weird")
        else if(N in 6..20)
            println("Weird")
        else if (N > 20)
            println("Not Weird")
    }
}