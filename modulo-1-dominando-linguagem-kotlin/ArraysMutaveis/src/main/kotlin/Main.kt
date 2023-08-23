fun main() {
    val listUsers = mutableListOf<User?>(
        User("Ricardo", true),
        User("Paloma", true),
        User("Augusto", true),
        User("Rodofo", true),
        User("Marlon", true),
    )

    println("Lista está vazia: ${listUsers.isEmpty()}")
    println("Lista não está vazia: ${listUsers.isNotEmpty()}")
    println("Lista esta nula ou vazia: ${listUsers.isNullOrEmpty()}")

    println("\n------------------------\n")
    listUsers.forEach { println(it?.name) }

    println("\n------------------------\n")

    println("Lista:")
    println("Primeiro: ${listUsers.first()}")
    println("Ultimo: ${listUsers.last()}")

    println("\n------------------------\n")
    val newUser = User("Joab", false)
    listUsers.add(newUser)
    println("Especifico: ${listUsers.find { it == newUser }?.name}")
    println("\n------------------------\n")

//    remove
    listUsers.removeAt(2); /** remove atravez do indice*/
    listUsers.remove(newUser) /** remove atraves do objeto*/

    listUsers.forEach { user-> println(user?.name) }
}

data class User(val name: String, val isAdmin: Boolean)