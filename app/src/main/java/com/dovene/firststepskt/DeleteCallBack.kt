package com.dovene.firststepskt

interface DeleteCallback {
    fun onDelete(essential: String)
}

interface DeleteUserCallback {
    fun onDelete(user: User)
}
