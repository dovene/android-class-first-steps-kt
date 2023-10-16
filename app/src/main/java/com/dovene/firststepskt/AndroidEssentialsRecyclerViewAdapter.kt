package com.dovene.firststepskt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class AndroidEssentialsRecyclerViewAdapter(essentials: MutableList<String>, deleteCallback: DeleteCallback): Adapter<AndroidEssentialsViewHolder>() {
    private var essentials = mutableListOf<String>()
    private var deleteCallback: DeleteCallback

    interface DeleteCallback {
        fun onDelete(essential: String)
    }

   init {
       this.essentials = essentials
       this.deleteCallback = deleteCallback
   }

    fun setEssentials(essentials: MutableList<String>) {
        this.essentials = essentials
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidEssentialsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.list_item, parent, false)
        return AndroidEssentialsViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  essentials.size
    }

    override fun onBindViewHolder(holder: AndroidEssentialsViewHolder, position: Int) {
        holder.bind(essentials[position], deleteCallback)
    }
}