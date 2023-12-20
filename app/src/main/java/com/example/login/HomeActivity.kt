package com.example.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myid = intent.getStringExtra("id")
        val myname = intent.getStringExtra("name")

        val idText = findViewById<TextView>(R.id.idtext)
        val nameText = findViewById<TextView>(R.id.nametext)

        idText.text = "    ◼   ID : $myid "
        nameText.text= "    ◼   이름 : $myname "

        //랜덤으로 이미지 출력
        val photoImage = findViewById<ImageView>(R.id.imageView)
        when(Random.nextInt(1, 6)) {
            1 -> photoImage.setImageResource(R.drawable.character1)
            2 -> photoImage.setImageResource(R.drawable.character2)
            3 -> photoImage.setImageResource(R.drawable.character3)
            4 -> photoImage.setImageResource(R.drawable.character4)
            5 -> photoImage.setImageResource(R.drawable.character5)
        }
        //종료
        val btn_finish = findViewById<Button>(R.id.btn_end)
        btn_finish.setOnClickListener{
            finish()
        }
    }
}