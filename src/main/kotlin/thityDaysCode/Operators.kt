package thityDaysCode

import kotlin.math.round


fun solve(mealCost: Double, tipPercent: Int, taxPercent: Int): Unit {

    val tip = (mealCost / 100) * tipPercent

    val tax = (taxPercent.toDouble() / 100) * mealCost

    println(round(mealCost + tip + tax).toInt())
}

fun main(args: Array<String>) {
    val mealCost = readln().trim().toDouble()

    val tipPercent = readln().trim().toInt()

    val taxPercent = readln().trim().toInt()

    solve(mealCost, tipPercent, taxPercent)
}
