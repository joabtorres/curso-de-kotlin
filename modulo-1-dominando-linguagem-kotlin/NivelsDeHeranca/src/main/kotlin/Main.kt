fun main() {
    val textView = TextView("texto")
    val button = ButtonView("Entrar", "#ssassff")

    textView.render()

    button.render()
}

open class TextView(var text: String) {
    protected var textColor: String = "#dddd"
    fun render() {
        println("Texto: $text, color: $textColor")
    }
}

class ButtonView(text: String, var background:String) : TextView(text) 