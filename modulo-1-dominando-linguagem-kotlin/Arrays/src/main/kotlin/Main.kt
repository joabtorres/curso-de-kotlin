fun main() {
    val numbers = intArrayOf(1,2,5,4,6,54,55);
    numbers.forEach { print("$it, ") }
    println("\n---------------")

    var users = arrayOf<User?>(
        User("joab", true),
        User("Ricardo", false),
        User("Pablo", false)
    )
    users.forEach { user ->println(user?.name) }

    println("----------------------")

    val newUsers = users.plus(User("Marcelo", true))

    newUsers[2] = null;

    newUsers.forEach { user->  println("User: ${user?.name}") }

}
class User(var name:String, var isAdmin:Boolean);