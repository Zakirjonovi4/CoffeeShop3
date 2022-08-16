import kotlin.system.exitProcess

fun main(){

    val moscowCoffeeShop = MoscowCoffeeShop(3.0, 4.5, 5.0)
    val newYorkCoffeeShop = NewYorkCoffeeShop(5.0, 7.5, 8.0)
    var currentCoffeeShop: CoffeeShop

    while (true){
    println("Hello. Choose a city:")
    println("1. Moscow\n2. New York\n\n0. Exit")

    currentCoffeeShop = when (readLine()) {
        "1" -> moscowCoffeeShop
        "2" -> newYorkCoffeeShop
        "0" -> break
        else -> {
            println("Error")
            continue
        }
    }
        chooseDrink(currentCoffeeShop)
    }

}

private fun chooseDrink(currentCoffeeShop: CoffeeShop) {
    println("Choose a drink")
    println("1. Americano\n2. Cappuccino\n3. Latte\n\n0. Show statistics ")

    when (readLine()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBiscuits(currentCoffeeShop)
        }
        "0" -> currentCoffeeShop.showStatistics()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}тщ

private fun checkAndAskForBiscuits(currentCoffeeShop: CoffeeShop){
    if (currentCoffeeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2. No")
        val isBiscuits = readLine()
        if (isBiscuits == "1") {
            currentCoffeeShop.sellBiscuits() //Проверка коментов =)
        }
    }
}