package com.dovene.firststepskt.ui

import com.dovene.firststepskt.model.User

interface DeleteCallback {
    fun onDelete(essential: String)
}

interface DeleteUserCallback {
    fun onDelete(user: User)
}
