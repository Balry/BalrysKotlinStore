import java.math.BigDecimal

class Order(var items: List<String>) {
    var cost: BigDecimal = BigDecimal.ZERO

    override fun toString(): String {
        return "Order(items=$items, cost=$cost)"
    }

}