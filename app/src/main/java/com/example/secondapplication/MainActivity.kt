package com.example.secondapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun enviarMensagem(view: View){
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextIdade  = findViewById<EditText>(R.id.editTextIdade)
        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)

        val nome = editTextNome.text.toString()
        val email = editTextEmail.text.toString()
        val idade = editTextIdade.text.toString()
        val telefone = editTextTelefone.text.toString()
        val intent = Intent(this, ShowMessageActivity::class.java).apply{
            putExtra("NOME", nome)
            putExtra("EMAIL", email)
            putExtra("IDADE", idade)
            putExtra("TELEFONE", telefone)
        }
        startActivity(intent)
    }




    companion object{
        const val INFO_EXTRA_NOME = "NOME"
        const val INFO_EXTRA_EMAIL = "EMAIL"
        const val INFO_EXTRA_IDADE = "IDADE"
        const val INFO_EXTRA_TELEFONE="TELEFONE"
    }
}