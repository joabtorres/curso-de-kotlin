fun main() {
    val joab = User("Joab", 30)

    val adress = User.Address("Rua X");

    println(adress.call())

}

class User(var name:String, var age:Int){

    class Address (var street: String){
       fun call(){
            println("Endere: $street")
        }
    }
}