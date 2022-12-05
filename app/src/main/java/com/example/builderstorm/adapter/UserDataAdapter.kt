package com.example.builderstorm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.builderstorm.databinding.ItemRecyclerViewBinding
import com.example.builderstorm.itemView.ItemProvider
import com.example.builderstorm.itemView.UserDataItemViewModel

class UserDataAdapter(val context: Context, private val itemList: ArrayList<ItemProvider>) :
    RecyclerView.Adapter<UserDataAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(canvassingEntity: ItemProvider) {
            binding.itemViewModel = canvassingEntity as UserDataItemViewModel
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val inflate = LayoutInflater.from(context)
        val listItemBinding = ItemRecyclerViewBinding.inflate(inflate, parent, false)
        return MyViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
