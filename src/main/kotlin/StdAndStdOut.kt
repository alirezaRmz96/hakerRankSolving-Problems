import java.util.Scanner

class StdAndStdOut {

    fun main(){
        val scan = Scanner(System.`in`)
        val i = scan.nextInt()
        val d = scan.nextDouble()
        scan.nextLine()
        val s = scan.nextLine()

        println(s)
        println(d)
        println(i)
    }
}
