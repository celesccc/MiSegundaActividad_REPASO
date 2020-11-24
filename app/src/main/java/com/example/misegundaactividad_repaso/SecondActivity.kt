package com.example.misegundaactividad_repaso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object  {
        const val VAR = "VARIABLE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val saludo = intent.getStringExtra(VAR)

        saludo.let {
            textview2.text = saludo
        }
    }
}