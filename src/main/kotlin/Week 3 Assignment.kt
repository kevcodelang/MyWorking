fun main(args: Array<String>) {
    /*Assignment one*/
    stringReplacement()
    /*Assignment two*/
    println("")
    var str = "Good food"
    var reverse = reverse(str)
    println(reverse)
}

fun stringReplacement() {
/*start modulus from highest multiple value*/
    for (i in 1..100) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println("$i")
        }
    }
}

fun reverse(str: String): String {
    val chars: CharArray = str.toCharArray()
    var l = 0
    var h = str.length - 1
    while (l < h)
    {
        val c = chars[l]
        chars[l] = chars[h]
        chars[h] = c
        l++; h--;
    }
    return String(chars)
}

