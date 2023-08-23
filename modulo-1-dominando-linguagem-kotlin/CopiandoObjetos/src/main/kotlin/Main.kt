/**
 * objeto.copy() - para copiar os valores do objeto
 *
 * OBS: SÓ FUNCIONA COM OBJETOS DATA
 */
fun main() {
    val userA = User("Joab Torres", "Rua Machado Lemos, nº 5", true);

    val userB = userA.copy("Eliane")

    println(userA)
    println(userB)

}
/** necessario cria classe data*/
data class User(val name:String, val address: String, val isAdmin: Boolean);
