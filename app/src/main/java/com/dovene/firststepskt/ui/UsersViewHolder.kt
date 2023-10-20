package com.dovene.firststepskt.ui

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.dovene.firststepskt.R
import com.dovene.firststepskt.model.User

class UsersViewHolder(itemView: View) : ViewHolder(itemView) {
    private var deleteIV: AppCompatImageView
    private var titleTV: AppCompatTextView
    private var emailTV: AppCompatTextView

    init {
        deleteIV = itemView.findViewById(R.id.delete)
        titleTV = itemView.findViewById(R.id.login_tv)
        emailTV = itemView.findViewById(R.id.email_tv)
    }

    fun bind(user: User, deleteUserCallback: DeleteUserCallback) {
        //fill user item with related information and set a callback on delete button click
        titleTV.text = user.login
        emailTV.text = user.email
        deleteIV.setOnClickListener { deleteUserCallback.onDelete(user) }
    }


}