package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input_id = findViewById<EditText>(R.id.et_id)
        var input_pw = findViewById<EditText>(R.id.et_pw)
        val btn_Signup = findViewById<Button>(R.id.btn_signup)
        val btn_login = findViewById<Button>(R.id.btn_login)

        val strid = intent.getStringExtra("id").toString()
        val strpw = intent.getStringExtra("password").toString()
        val strname = intent.getStringExtra("name").toString()

        // 회원가입 버튼
        btn_Signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        // 로그인버튼
        btn_login.setOnClickListener {
            val ip_id = input_id.text.toString()
            val ip_pw = input_pw.text.toString()

            if (ip_id.isEmpty() || ip_pw.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
            else if((ip_id == strid) && (ip_pw == strpw)){
                    Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("id",strid)
                    intent.putExtra("name",strname)
                    startActivity(intent)
            }
            else{
                Toast.makeText(this, "아이디와 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}