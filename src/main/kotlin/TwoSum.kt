class TwoSum {

    fun twoSumErrorRunTime(numbs: IntArray, target: Int): IntArray? {
        val seen = mutableListOf<Int>()
        for (i in 0..numbs.size) {
            for (j in 1..numbs.size) {
                if (numbs[j] == target - numbs[i]) {
                    seen.addAll(arrayOf(j, i))
                    println(seen)
                    return seen.toIntArray()
                }
            }
        }
        return null
    }

    fun twoSum(numbs: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        val seen = mutableListOf<Int>()
        for (i in numbs.indices) {
            map.put(numbs[i], i)
        }
        println(map)
        for (i in numbs.indices) {
            val complement = target - numbs[i]
            if (map.containsKey(complement) && map.get(complement) != i){
                seen.addAll(arrayOf(i,map.get(complement)!!))
                return seen.toIntArray()
            }
        }
        return null
    }
}
