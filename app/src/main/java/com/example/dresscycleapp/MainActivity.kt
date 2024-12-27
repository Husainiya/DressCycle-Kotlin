package com.example.dresscycleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val textView :TextView = findViewById(R.id.appname)
        val text ="Dress Cycle"

        val textView2:TextView=findViewById(R.id.textView4)
        val text2 = getString(/* resId = */ R.string.give_your_dresses_a_second_life)


        val button: Button =findViewById(R.id.button1)
        button.setOnClickListener {

            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }


    }

}