package co.tiagoaguiar.ganheinamega

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var prefs:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editNumber: EditText = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.txt_number)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

        //banco de dados de preferences
        prefs = getSharedPreferences("db", Context.MODE_PRIVATE)
        val result = prefs.getString("result", null)
        /*if(result != null){
            txtResult.text = "Última Aposta: $result"
        }*/

        result?.let {
            txtResult.text = "Última Aposta: $it"
        }

        btnGenerate.setOnClickListener {
            val text = editNumber.text.toString()
            numberGenerator(text, txtResult)
        }
    }

    private fun numberGenerator(text: String, txtResult: TextView) {

        if (text.isEmpty()) {
            Toast.makeText(this, "Digite um número entre 6 e 15", Toast.LENGTH_SHORT).show()
            return
        }

        val qtdNumbers: Int = text.toInt()
        if (qtdNumbers < 6 || qtdNumbers > 15) {
            Toast.makeText(this, "Digite um número entre 6 e 15", Toast.LENGTH_SHORT).show()
            return
        }

        val numbers = mutableListOf<Int>()
        val random = Random()
        while (true) {
            val newNumber = random.nextInt(60) //0..59
            numbers.add(newNumber + 1)
            if (numbers.size == qtdNumbers) {
                break
            }
        }
        txtResult.text = numbers.joinToString(" - ")

        //cadastrar no banco preferences
        val editor = prefs.edit()
        editor.putString("result", txtResult.text.toString())
        editor.apply()
        /*

        //segunda opção para salvar no kotlin
        prefs.edit().apply{
            putString("result", txtResult.text.toString())
            apply()
        }
        */

        /**
         * commit() - salva de forma sincrona (bloquear a interface)
         *              informa se teve sucesso ou não
         * apply() - Salvar de forma assincrona (não vai bloquear a interface)
         *          não informa se teve sucesso ou não
         */

    }

}

