package thityDaysCode

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    for (i in 0 until scan.nextInt()) {
        var evenChar = ""
        var oddChar = ""
        val str = scan.next()
        for (j in str.indices) {
            if (j % 2 == 0)
                evenChar += str[j]
            else
                oddChar += str[j]
        }
        println("$evenChar $oddChar")
    }

}