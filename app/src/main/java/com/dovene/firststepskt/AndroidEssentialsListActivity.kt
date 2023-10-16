package com.dovene.firststepskt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidEssentialsListActivity : AppCompatActivity() {
    private lateinit var essentialsRecyclerViewAdapter: AndroidEssentialsRecyclerViewAdapter
    private val androidEssentials = mutableListOf(
        "Activity",
        "Intent",
        "Layout",
        "Manifest",
        "Gradle",
        "Fragment",
        "LifeCycle",
        "Sharedpreference",
        "ROOM",
        "LiveData",
        "MVVM"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_essentials_list)
        setViewItems()
    }

    private fun setViewItems() {
        val essentialsRecyclerView = findViewById<RecyclerView>(R.id.essentials_RV)
        essentialsRecyclerViewAdapter =
            AndroidEssentialsRecyclerViewAdapter(
                androidEssentials,
                object : AndroidEssentialsRecyclerViewAdapter.DeleteCallback {
                    override fun onDelete(essential: String) {
                        androidEssentials.remove(essential)
                        essentialsRecyclerViewAdapter.setEssentials(androidEssentials)
                    }
                })
        essentialsRecyclerView.layoutManager = LinearLayoutManager(this)
        essentialsRecyclerView.adapter = essentialsRecyclerViewAdapter
    }
}