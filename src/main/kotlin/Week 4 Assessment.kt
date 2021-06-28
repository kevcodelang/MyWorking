fun main() {
    evenlyspaced(a = 6, b = 4, c = 2)
}

fun evenlyspaced(a: Int, b: Int, c: Int) {
    var max = a
    if (b > max) max = b
    if (c > max) max = c

    var min = a
    if (b < min) min = b
    if (c < min) min = c

    var med = max - min

    println((med - min) == (max - med))
}
