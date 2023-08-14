fun main() {
    /**
     * Nullable - permite salvar valores nulos em variaveis
     * Ex: String? = permite dados do tipo string ou null
     */
    var firstName: String? = "joab"

    /**
     * Elvis - Permite validar se a varivel difirente de null
     * Ex: variavel?.length ?: 0
     *
     * é igual a: if(variavel != null) variavel.length else 0
     *
     */
    println(firstName?.length ?: -1) // ELVIS
}