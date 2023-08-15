/**
 * utilizar object e a mesma coisa que classes staticas nunca é alterado a referencia objeto
 *
 */
object Database {
    fun connectDB(){
        println("Database: ${Config.DB_NAME}")
        println("Host: ${Config.DB_HOST}")
        println("User: ${Config.DB_USER}")
        println("Password: ${Config.DB_PASSWORD}")
    }
}

/**
 * Para declara várias constantes podemos criar um object como exemplo abaixo
 *
 * para criar uma constant deve seguir o exemplo abaixo
 * const val DB_NAME = "NOME_DO_BANCO"
 */
object Config{
    const val DB_NAME = "NOME_DO_BANCO"
    const val DB_HOST = "localhost"
    const val DB_USER = "root"
    const val DB_PASSWORD = ""
}