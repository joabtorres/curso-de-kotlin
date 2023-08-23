fun main() {
    val button = Button("ssaad","Botão", Pair(10,30))
    button.render()
}

/**
 * Classe Abstrata avo
 * abstract class - transforma classe em abstrata logo não pode ser instanciada
 */
abstract class Componnet{
    /**
     * método abstrato pai
     * abstract fun - transforma o metodo em abstrato logo não pode se instanciado e deve ser reescrito nas filhas
     */
    abstract fun position(): Pair<Int, Int>

    /**
     * open fun permite a sobreescrita da funcção
     */
    open fun render(){
        println("Desenhando a tela ${position().first} | ${position().second}")
    }
}

/**
 * Classe abstrata mae - herdas as propriedeade e comportamentos da pai
 */
abstract class Text(var text:String):Componnet(){
    override fun render() {
        super.render(); //super. metodo para acesar as propriedades e funções da classe pai [Componnet]
        println("Texto do butão: $text")
    }
}
class Button(var color: String, text:String, var pair: Pair<Int, Int>):Text(text){
    /**
     * override fun - metodo para sobreescrever uma classe pai
     */
    override fun position(): Pair<Int, Int> {
        return pair
    }

    override fun render() {
        super.render() //referice ao metodo render do objeto pai [Text] que por sua vez se submete ao avo [Componnet]
        println("Color: $color");
    }
}