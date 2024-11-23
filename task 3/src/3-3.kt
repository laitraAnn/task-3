val alphabet = mapOf(
    1 to 'е',
    2 to 'й',
    3 to 'н',
    4 to 'в',
    5 to 'ф',
    6 to 'п',
    7 to 'ю',
    8 to 'ч',
    9 to 'л',
    10 to 'щ',
    11 to 'т',
    12 to 'ж',
    13 to 'б',
    14 to 'и',
    15 to 'с',
    16 to 'р',
    17 to 'я',
    18 to 'ш',
    19 to 'э',
    20 to 'г',
    21 to 'а',
    22 to 'д',
    23 to 'м',
    24 to 'з',
    25 to 'ё',
    26 to 'у',
    27 to 'ц',
    28 to 'к',
    29 to 'о',
    30 to 'х',
    31 to 'ы',
    32 to 'ъ',
    33 to 'ь'
)

fun main() {
    println("Ключевое слово:")
    val key = input()
    println("Исходный текст:")
    val phrase = input()

    var result = ""
    for (i in phrase.indices) {
        val cKey = alphabet.keys.first {k -> alphabet[k] == phrase[i]}
        val shift = alphabet.keys.first {k -> alphabet[k] == key[i % key.length]}
        result += alphabet[(cKey + shift) % 33]
    }

    println("Зашифрованный текст: $result")
}

fun input() : String {
    var result:String
    while (true)
    {
        print("Введите слово -> ")
        result = readln().lowercase()
        if (result.isEmpty())
        {
            println("Нужно слово")
            continue
        }
        var isValid = true
        for (c in result) {
            if (!alphabet.values.contains(c)) {
                isValid = false
                break
            }
        }
        if (!isValid) {
            println("Используйте русский алфавит")
        }
        else {
            return result
        }
    }
}