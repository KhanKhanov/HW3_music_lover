fun main() {
    val sum = 10_004 // сумма покупки
    val regularCustomer = true //проверка на покупку в течении последнего месяца

    val discount = if (sum in 1_001..9999)
        100
    else if (sum >= 10_001)
        (sum * 0.05).toInt()
    else
        0
    println("Скидка от суммы покупки составляет $discount руб.")

    val totalAmount = if (regularCustomer) ((sum - discount) - ((sum - discount) * 0.01).toInt()) else sum - discount
    println("Итого сумма к оплате с учётом скидок составляет $totalAmount руб.")
}