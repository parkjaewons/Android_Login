package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_finish = findViewById<Button>(R.id.btn_end)
        btn_finish.setOnClickListener{
            finish()
        }

        val myid = intent.getStringExtra("id")
        val myname = intent.getStringExtra("name")

        val idText = findViewById<TextView>(R.id.idtext)
        val nameText = findViewById<TextView>(R.id.nametext)

        idText.text = "    ◼   ID : $myid "
        nameText.text= "    ◼   이름 : $myname "


    }
}