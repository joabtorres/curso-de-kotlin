fun main() {
    val firstName:String = "Joab"
    val lastName:String = "Alencar"
    val age:Byte = 30
    val email:String = "joabtorres1508@gmail.com"

    /**
     * lowercase() - metodo para deixa texto em caixa baixa
     * uppercase() - metodo pora deixa o texto caixa alta
     */
    println("Olá $firstName $lastName,\nSua idade é: $age anos\nSeu e-mail é: $email")

    println("\n|------------------------------------|")
    println("${firstName.lowercase()} ${lastName.uppercase()}")

    /**
     * utilizamos """ (aspa dupla tripa) quando precisamos descreve um texto longo
     * trimIndent() - metodo para remove a identação do código
     * replaceIndent(";") metodo para remover identação e subtituir por outro caracter
     */
    println("\n|------------------------------------|")
    val text:String = """
        Olá ${firstName.uppercase()} ${lastName.uppercase()},
        Você tem $age anos,
        É Seu e-mail é $email
    """.trimIndent()

    println("$text")

    val todoList:String= """
        Estudar
        Dormir
        Comer
        Sair
        Banhar
        Trabalhar
    """
    println("\n|------------------------------------|")
    println("Gerando texto CSV:")
    println(todoList.replaceIndent(";"))
}