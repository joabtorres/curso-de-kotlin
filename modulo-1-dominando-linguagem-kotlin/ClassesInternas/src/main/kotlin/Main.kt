fun main() {
    val user = User("joab Torres Alencar")
    user.Address()

    user.Address().street = "Francisco de Assis"
    user.Address().getStreet()
}

class User(var name: String) {

    inner class Address {
        lateinit var street:String
        fun getStreet() {
            println("Rua: ${this.street}")
        }
    }
}