package thityDaysCode

import java.io.BufferedReader
import java.io.InputStreamReader


fun binary(binaryNumber: String): Int {
    var maxCount = 0
    var currentCount = 0
    var sawZero = false

    for (digit in binaryNumber) {
        if (digit == '1') {
            currentCount++
            if (sawZero && currentCount > maxCount) {
                maxCount = currentCount
            }
        } else {
            sawZero = true
            if (currentCount > maxCount) {
                maxCount = currentCount
            }
            currentCount = 0
        }
    }

    return maxCount
}


fun main(args: Array<String>) {
    val nString = readln().trim().toInt()
    println(binary(Integer.toBinaryString(nString)))
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val n = bufferedReader.readLine().trim { it <= ' ' }.toInt()
    bufferedReader.close()
    println(result(n))
}

fun result(num: Int): Int {
    var num = num
    var currConsecutive = 0
    var maxConsecutive = 0
    while (num > 0) {
        if (num % 2 == 1) {
            currConsecutive++
            maxConsecutive = currConsecutive.coerceAtLeast(maxConsecutive)
        } else {
            currConsecutive = 0
        }
        num /= 2
    }
    return maxConsecutive
}
