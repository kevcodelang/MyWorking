fun main() {
    evenlyspaced(4, 6, 8)
}

fun evenlyspaced(a: Int, b: Int, c: Int) {
    var large = a
    if (b > large) large = b
    if (c > large) large = c

    var small = a
    if (b < small) small = b
    if (c < small) small = c

    var medium = ((a+b+c)-(large + small))

    println((medium - small) == (large - medium))
}
