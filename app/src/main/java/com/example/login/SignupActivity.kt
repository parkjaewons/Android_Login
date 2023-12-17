package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signp)

        val et_name = findViewById<EditText>(R.id.et_name)
        val et_id = findViewById<EditText>(R.id.et_signid)
        val et_pw = findViewById<EditText>(R.id.et_signpw)
        val btn_sign = findViewById<Button>(R.id.signup)

        //회원가입 기능
        btn_sign.setOnClickListener {
            val name = et_name.text.toString()
            val id = et_id.text.toString()
            val pw = et_pw.text.toString()

            if (name.isEmpty() || id.isEmpty() || pw.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
                val intent =  Intent(this, SignInActivity::class.java)
                intent.putExtra("id",id)
                intent.putExtra("password", pw)
                intent.putExtra("name",name)
                startActivity(intent)
            }
        }
    }

}