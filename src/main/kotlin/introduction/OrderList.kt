package introduction

open class Item(val name: String, val price: Int)

class Noodels : Item("Noodles", 10){
    override fun toString(): String {
        return name
    }
}
class Vegetables(vararg val Strings: String) :Item("Vegetables", 5) {
    override fun toString(): String {
        if (Strings.isEmpty()) {
            return "$name Chef's Choice"
        }else {
            return name + " " + Strings.joinToString()
        }
    }
}


class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total +=item.price
        }
        println("Total: $${total}")

    }
}

fun main(){
    val orderList = mutableListOf<Order>()


    val order1 = Order(1)
    order1.addItem(Noodels())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodels())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodels(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()

    val order4 = Order(4).addItem(Noodels()).addItem(Vegetables("Cabbage", "Onion"))
    orderList.add(order4)

    orderList.add(
        Order(5)
            .addItem(Noodels())
            .addItem(Noodels())
            .addItem(Vegetables("Spinach"))
    )

    for (order in orderList) {
        order.print()
        println()
    }

}