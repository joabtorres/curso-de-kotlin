class User (var name:String, var age:Int) {
    constructor(name:String):this(name, 18)
    constructor():this("Desconhecido", 18)

    //declarando inicializacao
    lateinit var lastName:String
    fun showname(){
        println("Nome: ${name} ${lastName}")
    }
}