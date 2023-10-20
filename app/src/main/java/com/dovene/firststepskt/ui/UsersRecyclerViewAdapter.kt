package com.dovene.firststepskt.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.dovene.firststepskt.R
import com.dovene.firststepskt.model.User


class UsersRecyclerViewAdapter(users: MutableList<User>, deleteCallback: DeleteUserCallback): Adapter<UsersViewHolder>() {
    private var users = mutableListOf<User>()
    private var deleteCallback: DeleteUserCallback


   init {
       this.users = users
       this.deleteCallback = deleteCallback
   }

    fun setEssentials(essentials: MutableList<User>) {
        this.users = essentials
        // important to force list refresh
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return  users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.list_item, parent, false)
        return UsersViewHolder(view)
    }


    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bind(users[position], deleteCallback)
    }
}