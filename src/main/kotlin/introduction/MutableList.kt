package introduction

fun main() {
    val entrees = mutableListOf<String>()
    val moreItems = listOf("githeri", "ugali", "viazi")

    println("Entrees: $entrees")
    println("Add mukimo: ${entrees.add("mukimo")}")
    println("Entrees: $entrees")

    //remove one entree
    println("Remove spinach: ${entrees.remove("spinach")}")
    println("Entrees: $entrees")

    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    //Remove items that do not exist
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    //Specifying the index to remove
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    //Clearing the data
    entrees.clear()
    println("Entrees: $entrees")

    //Empty
    println("Empty? ${entrees.isEmpty()}")
}