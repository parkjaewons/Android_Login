package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input_id = findViewById<EditText>(R.id.et_id)
        val input_pw = findViewById<EditText>(R.id.et_pw)
        val btn_Signup = findViewById<Button>(R.id.btn_signup)
        val btn_login = findViewById<Button>(R.id.btn_login)


        // 회원가입 버튼
        btn_Signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }
}