fun main() {
   print("Введите слово -> ")
    val input = readln().split(' ')
    val result = mutableMapOf<String, MutableList<String>>()

    for (word in input) {
        val chars = word.toList().distinct().sorted().toString()
        val list = result[chars]
        if (list == null) {
            result[chars] = mutableListOf(word)
        } else {
            list.add(word)
        }
    }

    for (group in result.values) {
        for (word in group) {
            print("$word \t")
        }
        println()
    }
}