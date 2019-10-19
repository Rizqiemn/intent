package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val id:Int=10
    val language:String="kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_klik.setOnClickListener(){
            intent=Intent(this, ActivityKedua::class.java)
            intent.putExtra("id_Value",id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}
