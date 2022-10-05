package introduction

fun main() {

    val guestsPerFamily = listOf(2,4,1,3)
    var totalGuests = 0
    var index = 0
    val names = listOf("JohnDoe", "Jane", "Mary", "Mark")

    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }

    println("Total Guest Count: $totalGuests")

    /*
    FOR
    LOOP
     */
    for (name in names) {
        println("$name - Number of characters: ${name.length}")
    }
}