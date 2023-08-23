fun main() {
    /**
     * mutableSetOf  - não adicionar itens repetidos
     * OBS: PRECIS USA DATA CLASS
     */
    val users = mutableSetOf(
        User("Joab", 18),
        User("Joab", 18),
        User("Carlos", 20),
        User("Joab", 18),
    )

    users.forEach { println(it) }
}
/** PRECISA DECLARA DATACLASS PARA USA SETOF */
data class User (val name:String, val age:Int = 18)