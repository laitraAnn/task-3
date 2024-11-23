fun main() {
    print("Введите количество строк: ")
    val rows = readln().toIntOrNull() ?: return println("Неверный ввод. Программа завершена.")
    print("Введите количество столбцов: ")
    val cols = readln().toIntOrNull() ?: return println("Неверный ввод. Программа завершена.")

    val array = Array(rows) { IntArray(cols) }

    println("Введите ${rows * cols} трехзначных чисел:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            var pr = true
            while (pr) {
                val num = readLine()?.toIntOrNull()
                if (num == null || num <= 99 || num > 999) {
                    println("Введено не трехзначное число. Попробуйте еще раз.")
                } else {
                    array[i][j] = num
                    pr = false
                }
            }

        }
    }


    for (row in array) {
        for (num in row) {
            print("$num \t")
        }
        println()
    }

    val uniqueDigits = mutableSetOf<Char>()
    for (row in array) {
        for (number in row) {
            number.toString().forEach { digit ->
                uniqueDigits.add(digit)
            }
        }
    }

    println("В массиве использовано ${uniqueDigits.size} различных цифр")
}
