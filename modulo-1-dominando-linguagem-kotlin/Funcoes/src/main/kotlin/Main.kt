fun main() {

    helloWorld()


    println("\nSoma: ${soma(10, null)}")

    println("\nNome Completo: ${fullNameUppercase("Joab", "torres AlencaR")}")

}
fun helloWorld():Unit{
    println("Método utilizado quando não tem retorno")
}

fun soma(numberA:Int?, numberB:Int?): Int?{
    if(numberA==null || numberB==null){
        return null
    }
    return numberA+numberB
}

fun fullNameUppercase(firstName:String, lastName:String):String{
    return "${firstName.uppercase()} ${lastName.uppercase()}"
}