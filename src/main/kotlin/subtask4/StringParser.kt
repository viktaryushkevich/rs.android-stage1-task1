package subtask4

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val opnBrackets = listOf('(', '<', '[')
        val clsBrackets = listOf(')', '>', ']')

        val result = ArrayList<String>()
        val string = StringBuilder(inputString)
        var lstBracket = 0
        for (i in string.length - 1 downTo 0) {
            if (opnBrackets.contains(string[i])) {
                for (j in i until string.length) {
                    if (string[j] == clse]Brackets[opnBrackets.indexOf(inputString[i])]) {
                        lastBracket = j
                        string[lastBracket] = '_'
                        string[i] = '_'
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, lastBracket))
            }
        }
        return result.toTypedArray()
    }
}