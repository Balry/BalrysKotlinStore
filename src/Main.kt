import java.math.BigDecimal

fun main(order: Order) {
    println("your order is " + order.items)

    order.items.forEach {
        if (it.equals("apple", true))
            order.cost = order.cost.add(BigDecimal("0.60"))
        else if (it.equals("orange", true))
            order.cost = order.cost.add(BigDecimal("0.25"))
        else
            println("We do not have any \"" + it + "\" in stock. Item has been automatically removed from your order.")
    }

    println("You order cost is $" + order.cost)
}

//fun main(rawOrder: String) {
//    //println("Please type your order what is your order?")
//    //var order = readLine()!!.split(",").map { it.trim() }
//    //var order = rawOrder!!.split(",").map { it.trim() }
//
//    var order = Order(rawOrder!!.split(",").map { it.trim() })
//    println("your order is " + order + " iam a "+ order.javaClass)
//
//    var cost: Double = 0.0
//    order.items.forEach {
//        if (it.equals("apple", true))
//            cost+=0.60
//        else if (it.equals("orange", true))
//            cost+=0.25
//        else
//            println("We do not have any \"" + it + "\" in stock. Item has been automatically removed from your order.")
//    }
//
//    println("You order cost is $" + cost)
//}