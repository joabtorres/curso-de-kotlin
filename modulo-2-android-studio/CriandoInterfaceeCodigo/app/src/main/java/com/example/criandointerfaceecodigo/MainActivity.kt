package com.example.criandointerfaceecodigo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtHelloWorld: TextView = findViewById(R.id.txt_helloworld)
        val btnSubmit:Button = findViewById(R.id.btn_submit)

        btnSubmit.setOnClickListener(View.OnClickListener {
            updateText(txtHelloWorld)
        })
    }

    fun updateText(txtHelloWorld:TextView){
        txtHelloWorld.setText(R.string.newText)
    }
}