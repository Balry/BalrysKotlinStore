import org.junit.Assert
import org.junit.Test
import java.math.BigDecimal

class OrderTest{

    @Test
    fun testSimpleOrder() {
        val order = Order("Apple, Apple, Orange, Apple".split(",").map { it.trim() })
        main(order)
        Assert.assertEquals(BigDecimal("2.05"), order.cost)
    }

    @Test
    fun testSimpleOrderNullItem() {
        val order = Order("Apple, Apple, Orange, Apple, Banana".split(",").map { it.trim() })
        main(order)
        Assert.assertEquals(BigDecimal("2.05"), order.cost)
    }

    @Test
    fun testSimpleOrderExtraComma() {
        val order = Order("Apple, Apple, Orange, Apple,".split(",").map { it.trim() })
        main(order)
        Assert.assertEquals(BigDecimal("2.05"), order.cost)
    }

    @Test
    fun testSimpleOrderNullItemExtraComma() {
        val order = Order(", Banana, Apple, Apple, Orange, Apple, Banana".split(",").map { it.trim() })
        main(order)
        Assert.assertEquals(BigDecimal("2.05"), order.cost)
    }

    @Test
    fun testBigOrder() {
        val order = Order("Apple, Apple, Orange, Apple, Orange, Apple, Orange, Apple, Orange, Apple, Apple, apple, apple, orange".split(",").map { it.trim() })
        main(order)
        Assert.assertEquals(BigDecimal("6.65"), order.cost)
    }

}