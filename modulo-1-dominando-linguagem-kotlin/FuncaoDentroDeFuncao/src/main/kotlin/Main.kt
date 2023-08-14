fun main() {
    println(soma(10.0, null))
}

/**
 * Escopo de Função
 * Utilizado quando criamos uma ou varias funções dentro de uma função já existente
 */
fun soma(number1: Double?, number2: Double?): Double? {

    //Ex:
    fun isDouble(number: Double?): Double {
        if (number == null) {
            return 0.toDouble()
        }
        return number
    }
    println("Number 1: ${isDouble(number1)}")
    println("Number 2: ${isDouble(number2)}")

    return isDouble(number1) + isDouble(number2)
}