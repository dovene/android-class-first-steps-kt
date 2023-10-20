package com.dovene.firststepskt.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.dovene.firststepskt.R

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setViewItems()
    }

    private fun setViewItems() {

        // retrieve user input from previous activity
        val loginValue = intent.extras?.getString(MainActivity.userLoginKey)
        findViewById<TextView>(R.id.login_tv).text = loginValue

        val emailValue = intent.extras?.getString(MainActivity.emailKey)
        findViewById<TextView>(R.id.email_tv).text = emailValue

        // set event on button to start next activity
        findViewById<AppCompatButton>(R.id.essentials_bt).setOnClickListener {
            val intent = Intent(this, UsersListActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}