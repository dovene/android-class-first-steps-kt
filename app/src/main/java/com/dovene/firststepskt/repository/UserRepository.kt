package com.dovene.firststepskt.repository

import com.dovene.firststepskt.model.User

class UserRepository {
companion object {
    // Mock data for our users list
    val users = mutableListOf(
        User("Adnane","adnane@hb.com"),
        User("Ewan","ewan@hb.com"),
        User("IB","ib@hb.com"),
        User("JP","jp@hb.com"),
        User("Ryad","ryad@hb.com"),
        User("Killian","killian@hb.com"),
        User("Younous","younousan@hb.com"),
    )
}

}