package com.dovene.firststepskt

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    companion object {
        const val userLoginKey = "login"
        const val emailKey = "email"

        const val authorizedLogin = "login"
        const val authorizedEmail = "email"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewItems()
    }

    private fun setViewItems() {
        findViewById<AppCompatButton>(R.id.login_bt).setOnClickListener {
            val intent = Intent(this, HelloActivity::class.java)
            val userLogin = findViewById<AppCompatEditText>(R.id.login_et).text.toString()
            val email = findViewById<AppCompatEditText>(R.id.email_et).text.toString()

            if (userLogin == authorizedLogin && email == authorizedEmail) {
                intent.putExtra(userLoginKey,userLogin)
                intent.putExtra(emailKey,email)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Identifiants incorrects, veuillez modifier votre saisie", Toast.LENGTH_LONG).show()
            }
        }
    }
}