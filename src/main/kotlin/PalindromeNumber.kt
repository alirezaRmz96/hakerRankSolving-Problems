import java.lang.Exception

class PalindromeNumber {
    fun isPalindromeNumberAsString(x: Int): Boolean {
        return try {
            val number = x.toString()
            val reversNumber = number.reversed()
            number.toInt() == reversNumber.toInt()
        } catch (e: Exception) {
            false
        }
    }

    fun isPalindromeNumber(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false
        }
        var revertedNumber = 0
        var y = x
        while (y > revertedNumber) {
            revertedNumber = revertedNumber * 10 + y % 10
            y /= 10
        }

        return y == revertedNumber || y == revertedNumber / 10
    }
}