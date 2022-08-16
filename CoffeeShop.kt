abstract class CoffeeShop(val americanoPrice: Double, val cappuccinoPrice: Double, val lattePrice: Double) {
    var americanoCount = 0
    var cappuccinoCaunt = 0
    var latteCount = 0


    abstract fun makeAmericano()
    abstract fun makeCappuccino()
    abstract fun makeLatte()

    fun showStatistics(){
        println("Americano sold: $americanoCount")
        println("Cappuccino sold: $cappuccinoCaunt")
        println("Latte sold: $latteCount")

        val money = americanoCount*americanoPrice + cappuccinoCaunt*cappuccinoPrice + latteCount*lattePrice
        println("Money earned: $money")
    }
}