package com.example.webviewkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

var tmp = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        /* 웹뷰에서 새 창 뜨지 않도록 방지하는 구문 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        btn_naver.setOnClickListener { view ->
            webView.loadUrl("https://www.naver.com") // 링크 주소를 load
            btn_naver.visibility = View.INVISIBLE
            btn_google.visibility = View.INVISIBLE
            tmp = 1
        }

        btn_google.setOnClickListener { view ->
            webView.loadUrl("https://www.google.com") // 링크 주소를 load
            btn_naver.visibility = View.INVISIBLE
            btn_google.visibility = View.INVISIBLE
            tmp = 1
        }

    }


    override fun onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack() // 웹사이트 뒤로가기
        }
        else if(tmp == 1) {
            startActivity(Intent(this, MainActivity::class.java))
            tmp = 0
            finish()
        }
        else if(tmp == 0)
            super.onBackPressed() // 원래 백버트 기능
        }
    }
