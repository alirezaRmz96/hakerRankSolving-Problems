package thityDaysCode

import java.util.*
import kotlin.collections.HashMap

/* fun main() {

    val myMap = mutableMapOf<String, String>()
    val names = mutableListOf<String>()

    val max = readLine()?.trim()?.toInt()

    max?.let {
        for (i in 0 until max) {
            val result = readLine()?.trimEnd()?.split(" ")
            result?.let {
                myMap[result[0]] = result[1]
            }

        }
        for (i in 0 until max) {
            names.add(readLine()?.trim().toString())
        }
    }

    for (name in names) {
        if (myMap.containsKey(name)) {
            println("$name=${myMap[name]}")
        } else
            println("Not found")
    }
}*/


fun main() {
    val input = Scanner(System.`in`)
    val numNames: Int = input.nextLine().toInt()
    val phonebook = HashMap<String, String>()
    for (i in 0 until numNames) {
        val splitContact: MutableList<String> =
            input.nextLine().split(" ").toMutableList()
        phonebook[splitContact[0]] = splitContact[1]
    }
    while (input.hasNext()) {
        val name: String = input.nextLine()
        if (phonebook.containsKey(name)) {
            System.out.printf("%s=%s\n", name, phonebook[name])
        } else {
            println("Not found")
        }
    }
    input.close()
}
