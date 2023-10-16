package com.dovene.firststepskt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setViewItems()
    }

    private fun setViewItems() {
        findViewById<AppCompatTextView>(R.id.login_tv).text = intent.extras?.getString("login")
        findViewById<AppCompatButton>(R.id.essentials_bt).setOnClickListener {
            val intent = Intent(this, AndroidEssentialsListActivity::class.java)
            startActivity(intent)
        }
    }
}