fun main() {
    var num = 267239
    println("Number: $num")
    println("Reverse number: " + reverseNumber(num))

}

fun reverseNumber(number: Int): Int {
    var number = number
    var reverse = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number = number / 10
    }
    return reverse

}