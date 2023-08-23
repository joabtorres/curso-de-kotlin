fun main() {
    val lista = mutableListOf("Joab", "ricardo", "pepelino");
    val listb = listOf("douglas", "paulo", "mini")
    listb.filterTo(lista, {it.contains("a")}) //filtra por sequencia de palavras
    print(lista)

    println()
    val listc = listOf("Joab", "ricardo", "pepelino");
    val listd = listOf("douglas", "paulo", "mini")
    val listAll = listOf(listc, listd) //vira multiplos arrays
    println(listAll.flatten()) //junta tudo em um unico array
}