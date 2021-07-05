import java.lang.StringBuilder

fun main() {

    println(removeVowel("Hello Kotlin Nigeria"))
}

fun removeVowel(text: String): String {
    var result = StringBuilder()
    for (char in text) {
        if (!"aeiou".contains(char.toLowerCase())) {
            result.append(char)
        }
    }
    return result.toString()
}
