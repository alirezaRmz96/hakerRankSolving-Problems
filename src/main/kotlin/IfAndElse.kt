import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var N: Int = scanner.nextInt()
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?")
    if (N % 2 != 0)
        println("werid")
    else if(N%2 == 0 || (2..5).toList().contains(N))
        println("Not Weird")
    else if (N%2 == 0 || (6..20).toList().contains(N))
        println("werid")
    else if (N%2 == 0 || N > 20)
        println("Not Weird")
    scanner.close()
}
