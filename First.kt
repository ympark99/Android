package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{
            // var : 변수
            // val : 자바에서는 final 값이 변경되지 못하는 변수

            val intent = Intent(this,Subactivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 설정
            intent.putExtra("msg",tv_sendMsg.text.toString()) // msg에 Helloworld라는 텍스트 값 담음
            startActivity(intent)

        }



    }
}
