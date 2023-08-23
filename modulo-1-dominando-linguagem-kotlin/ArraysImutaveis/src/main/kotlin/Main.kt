fun main(args: Array<String>) {
    /**
     * listOff - para valores imutaveis
     */
    val users = listOf<User?>(
        User("joab", true),
        User("Ricardo", true),
        User("Joyce", true),
        User("Paloma", true)
    )
    users.forEach { user-> println(user?.name)}
}
class User(val name:String, val isAdmin:Boolean)