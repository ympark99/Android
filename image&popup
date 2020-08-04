package com.example.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tmp = 1

        btn_toast.setOnClickListener{

            /*  두개 같음
            Toast.makeText(this@MainActivity,"귀여운 익명입니다.",Toast.LENGTH_SHORT).show()

            var test =  Toast.makeText(this@MainActivity,"귀여운 익명입니다.",Toast.LENGTH_SHORT)
            test.show()
            */

            if(tmp==0){
                iv_profile.setImageResource(R.drawable.anonymous)  // 이미지 뷰에 새로운 이미지 등록
                Toast.makeText(this@MainActivity,"서있는 익명입니다.",Toast.LENGTH_SHORT).show()
                tmp = 1
            }
            else if(tmp==1){
                iv_profile.setImageResource(R.drawable.anonymous2)  // 이미지 뷰에 새로운 이미지 등록
                Toast.makeText(this@MainActivity,"하트날리는 익명입니다.",Toast.LENGTH_SHORT).show()
                tmp = 0
            }

        }
    }
}
