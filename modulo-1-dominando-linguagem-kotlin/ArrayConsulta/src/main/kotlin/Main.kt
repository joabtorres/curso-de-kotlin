fun main(args: Array<String>) {
    val users = mutableListOf<User?>(
        null,
        User("Joab", 40),
        User("Ricardo" ),
        User("Alex", 20),
        User("Joanab", 50)
    )

    println("Primeiro: ${users.first()}")

    println("ultimo: ${users.last()}")

    val filterUser = users.firstOrNull{it?.name == "Joab"}

    println("Especifico:"+filterUser)

    val filter2 = users.filter {
        it?.name?.lowercase().toString().contains("ab")
    }

    println("Especifico:"+filter2)

}

data class User (val name:String, val age:Int = 18)