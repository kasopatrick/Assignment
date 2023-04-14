package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Website : AppCompatActivity() {
    lateinit var mwebu: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        mwebu = findViewById(R.id.mWebsite)
        val webSettings = mwebu.settings
        webSettings.javaScriptEnabled = true
        mwebu.loadUrl("https://www.emobilis.ac.ke")
    }
}