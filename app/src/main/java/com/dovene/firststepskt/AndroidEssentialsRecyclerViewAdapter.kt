package com.dovene.firststepskt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter


class AndroidEssentialsRecyclerViewAdapter(users: MutableList<User>, deleteCallback: DeleteUserCallback): Adapter<AndroidEssentialsViewHolder>() {
    private var users = mutableListOf<User>()
    private var deleteCallback: DeleteUserCallback


   init {
       this.users = users
       this.deleteCallback = deleteCallback
   }

    fun setEssentials(essentials: MutableList<User>) {
        this.users = essentials
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return  users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidEssentialsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.list_item, parent, false)
        return AndroidEssentialsViewHolder(view)
    }



    override fun onBindViewHolder(holder: AndroidEssentialsViewHolder, position: Int) {
        holder.bind(users[position], deleteCallback)
    }
}