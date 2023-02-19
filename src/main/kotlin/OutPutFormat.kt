import java.util.*

class OutPutFormatKotlin {

    fun show() {
        try {


            for (i in 0..3) {
                var scanner = Scanner(System.`in`)
                val s1 = scanner.next()
                val x1 = scanner.nextInt()
                print(s1)
                for (i in 0..15 - s1.length) {
                    print(" ")
                }
                println(x1)
            }
        }catch (e:Exception){}
    }

}