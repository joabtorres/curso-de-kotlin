fun main() {

    val joab = Person("Joab", "Torres Alencar", "joabtorres1508@gmail.com", "prodepa", 3, 1)
    println(joab)
    println("\n${joab.getPerson()}")


    val eliane = Person("Eliane", "Silva Gomes", "eliane@gmail.com")
    println("Objeto: ${eliane}")
    println(eliane.getPerson())
}