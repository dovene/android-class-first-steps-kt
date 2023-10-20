package com.dovene.firststepskt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dovene.firststepskt.R
import com.dovene.firststepskt.model.User
import com.dovene.firststepskt.repository.UserRepository

class UsersListActivity : AppCompatActivity() {

    private lateinit var essentialsRecyclerViewAdapter: UsersRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_essentials_list)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setViewItems()
    }

    private fun setViewItems() {
        val essentialsRecyclerView = findViewById<RecyclerView>(R.id.essentials_RV)

        // instantiate recyclerview adapter
        essentialsRecyclerViewAdapter =
            UsersRecyclerViewAdapter(
                UserRepository.users,
                object : DeleteUserCallback {
                    override fun onDelete(user: User) {
                        // Delete selected user and refresh the list
                        UserRepository.users.remove(user)
                        essentialsRecyclerViewAdapter.setEssentials(UserRepository.users)
                    }
                })

        // set recyclerview required attributes
        essentialsRecyclerView.layoutManager = LinearLayoutManager(this)
        essentialsRecyclerView.adapter = essentialsRecyclerViewAdapter
    }
}