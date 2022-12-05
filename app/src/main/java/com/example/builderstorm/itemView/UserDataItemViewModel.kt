package com.example.builderstorm.itemView

import android.content.ClipData.Item
import com.example.builderstorm.enitity.UserData

class UserDataItemViewModel(val User: UserData, val listener: UserDataItemListener) : ItemProvider {

    fun onItemClick() {
        listener.onclick(this)
    }

    interface UserDataItemListener {
        fun onclick(itemsViewModel: UserDataItemViewModel)
    }
}