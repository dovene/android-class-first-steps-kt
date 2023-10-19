package com.dovene.firststepskt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidEssentialsListActivity : AppCompatActivity() {

    private lateinit var essentialsRecyclerViewAdapter: AndroidEssentialsRecyclerViewAdapter

    // fake objects list for recycler view


    private val users = mutableListOf(
        User("Adnane","adnane@hb.com"),
        User("Ewan","ewan@hb.com"),
        User("IB","ib@hb.com"),
        User("JP","jp@hb.com"),
        User("Ryad","ryad@hb.com"),
        User("Killian","killian@hb.com"),
        User("Younous","younousan@hb.com"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_essentials_list)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setViewItems()
    }

    private fun setViewItems() {
        val essentialsRecyclerView = findViewById<RecyclerView>(R.id.essentials_RV)

        essentialsRecyclerViewAdapter =
            AndroidEssentialsRecyclerViewAdapter(
                users,
                object : DeleteUserCallback {
                    override fun onDelete(user: User) {

                        users.remove(user)
                        essentialsRecyclerViewAdapter.setEssentials(users)


                    }
                })

        essentialsRecyclerView.layoutManager = LinearLayoutManager(this)
        essentialsRecyclerView.adapter = essentialsRecyclerViewAdapter
    }
}