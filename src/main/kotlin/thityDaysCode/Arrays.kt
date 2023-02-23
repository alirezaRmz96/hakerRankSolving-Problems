package thityDaysCode

fun main() {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = mutableListOf<Int>()
    for (i in 0 until n){
        result.add(arr[i])
    }
    println(result.reversed().joinToString(" "))
}

