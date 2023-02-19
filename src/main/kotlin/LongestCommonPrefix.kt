class LongestCommonPrefix {
    fun longestCommonPrefixCommonly(strs: Array<String>): String {
        if (strs == null || strs.isEmpty() || strs[0].isEmpty() ) return ""
        for (i in strs.indices){
            val c = strs[0][i]
            for (j in strs.indices){
                if (i == strs[j].length || strs[j][i] != c){
                    return strs[0].substring(0,i)
                }
            }
        }
        return strs[0]
    }


    fun longestCommonPrefix(strs: Array<String>?): String? {
        return if (strs == null || strs.isEmpty()) "" else longestCommonPrefixCommonly(strs, 0, strs.size - 1)
    }

    private fun longestCommonPrefixCommonly(strs: Array<String>, l: Int, r: Int): String {
        return if (l == r) {
            strs[l]
        } else {
            val mid = (l + r) / 2
            val lcpLeft = longestCommonPrefixCommonly(strs, l, mid)
            val lcpRight = longestCommonPrefixCommonly(strs, mid + 1, r)
            commonPrefix(lcpLeft, lcpRight)
        }
    }

    private fun commonPrefix(left: String, right: String): String {
        val min = left.length.coerceAtMost(right.length)
        for (i in 0 until min) {
            if (left[i] != right[i]) return left.substring(0, i)
        }
        return left.substring(0, min)
    }
}

