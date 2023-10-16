package com.dovene.firststepskt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewItems()
    }

    private fun setViewItems() {
        findViewById<AppCompatButton>(R.id.login_bt).setOnClickListener {
            val intent = Intent(this, HelloActivity::class.java)
            val userLogin = findViewById<AppCompatEditText>(R.id.login_et).text.toString()
            intent.putExtra("login",userLogin)
            startActivity(intent)
        }
    }
}