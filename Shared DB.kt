package com.example.sharedkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: 저장된 데이터를 로드
        loadData() // edit text 저장된 값을 setText
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        et_hello.setText(pref.getString("name","")) // 1번째 인자에서는 저장할 당시 키 값 적어줌, 2번째 키 값에 데이터가 존재하지 않을 경우 대체 값을 적어줌
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit() // 수정모드
        edit.putString("name",et_hello.text.toString()) // 1번쨰 키값, 2번째 실제 담아둘 값
        edit.apply() // 저장 완료
    }

    override fun onDestroy() {  // 해당 액티비티가 종료되는 시점이 다가올때 호출
        super.onDestroy()

        saveData()  // edit text 값을 저장
    }


}
