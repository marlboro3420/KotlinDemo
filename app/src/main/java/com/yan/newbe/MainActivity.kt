package com.yan.newbe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWebView()

//        var intent = Intent(this, SeActivity::class.java)
        val list = arrayListOf<String>(
                "asd", "asda", "asd"
        )
        Log.e("Kt", list.toString())
    }

    fun initWebView() {
        webView.settings.domStorageEnabled = true
        webView.loadUrl("asdasd")
    }
}
