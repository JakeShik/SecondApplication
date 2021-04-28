package com.example.secondapplication

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*
import java.util.Calendar.getInstance

class ShowMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)
        val nome = intent.getStringExtra(MainActivity.INFO_EXTRA_NOME)
        val idade = intent.getStringExtra(MainActivity.INFO_EXTRA_IDADE)
        val email = intent.getStringExtra(MainActivity.INFO_EXTRA_EMAIL)
        val telefone = intent.getStringExtra(MainActivity.INFO_EXTRA_TELEFONE)
        val textViewNome =findViewById<TextView>(R.id.textViewNome)
        val textViewIdade =findViewById<TextView>(R.id.textViewIdade)
        val textViewEmail =findViewById<TextView>(R.id.textViewEmail)
        val textViewTelefone =findViewById<TextView>(R.id.textViewTelefone)
        textViewNome.text = nome
        textViewIdade.text = idade.toString()
        textViewEmail.text = email
        textViewTelefone.text = telefone.toString()

    }





}