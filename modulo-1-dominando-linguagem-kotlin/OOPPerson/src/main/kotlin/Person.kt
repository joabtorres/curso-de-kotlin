class Person constructor(
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var level: Int,
    var status: Int = 0
) {
    constructor(firstName: String, lastName: String, email: String) : this(firstName, lastName, email, "", 0, 0)

    /**
     * INIT - é como o construtor (sé que não tem parametros) e é executado depois do construtor padrão.
     */
    init {
        println("Objeto inicializado: ${this.toString()}")
        if (this.firstName == "") {
            println("Não foi informado um nome válido")
        }
        if (this.lastName == "") {
            println("Não foi informado o sobrenome válido")
        }
        if (this.email == "") {
            println("Não foi informado um email válido")
        }
    }

    fun getPerson(): String {
        return """
            Nome: ${this.firstName} ${this.lastName}
            Email: ${this.email}
            Password: ${this.password}
            Nível de Acesso: ${getLevel()}
            Status: ${this.getStatus()}
        """.trimIndent()
    }

    fun getLevel(): String {
        if (this.level >= 3) {
            return "Avançado"
        } else if (this.level == 2) {
            return "Intermediário"
        } else if (this.level == 1) {
            return "Básico"
        } else {
            return "Inativo"
        }
    }

    fun getStatus(): Boolean {
        if (this.status == 0) {
            return false
        }
        return true
    }
}