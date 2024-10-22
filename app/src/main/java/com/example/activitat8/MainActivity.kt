package com.example.activitat8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBoxMateria1= findViewById<CheckBox>(R.id.materia1)
        val checkBoxMateria2= findViewById<CheckBox>(R.id.materia2)
        val checkBoxMateria3= findViewById<CheckBox>(R.id.materia3)
        val radioGroupTuron = findViewById<RadioGroup>(R.id.turno)
        val botonEnviar = findViewById<Button>(R.id.button)




    }
}





