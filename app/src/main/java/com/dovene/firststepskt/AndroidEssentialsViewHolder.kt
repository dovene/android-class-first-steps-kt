package com.dovene.firststepskt

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AndroidEssentialsViewHolder(itemView: View) : ViewHolder(itemView) {
    private var deleteIV: AppCompatImageView
    private var titleTV: AppCompatTextView
    init {
        deleteIV = itemView.findViewById(R.id.delete)
        titleTV = itemView.findViewById(R.id.title)
    }

    fun bind(
        essential: String,
        deleteCallback: AndroidEssentialsRecyclerViewAdapter.DeleteCallback
    ) {
        titleTV.text = essential
        deleteIV.setOnClickListener { deleteCallback.onDelete(essential) }
    }


}