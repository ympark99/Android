package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.anonymous, " 익명이","1삻","하잉"),
        User(R.drawable.anonymous2, " 하트 익명이","2살","하트하트"),
        User(R.drawable.anonymous3, " 뱃살 익명이","3살","다이어트")

        )



    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과","배","딸기","키위","익명")
//        // context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,item)

        val Adapter = UserAdaptor(this,UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectitem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectitem.name,Toast.LENGTH_SHORT).show()

        }
    }
}
