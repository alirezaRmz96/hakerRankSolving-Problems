class Panagram {

    private val seen: HashSet<Char> = HashSet()

    fun checkIfPangram(sentence: String): Boolean {
        val sentenceList = sentence.toList()
        for (i in sentenceList) {
            seen.add(i)
        }
        return seen.size == 26
    }

}