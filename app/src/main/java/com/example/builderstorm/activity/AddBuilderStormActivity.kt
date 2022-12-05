package com.example.builderstorm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.builderstorm.R
import com.example.builderstorm.adapter.UserDataAdapter
import com.example.builderstorm.databinding.ActivityAddBuilderStormBinding
import com.example.builderstorm.viewModels.AddBuilderStormViewModel

class AddBuilderStormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBuilderStormBinding
    private lateinit var linearLayout: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_builder_storm)
        binding.viewModel = AddBuilderStormViewModel()
        setUserDataAdapter()
    }

    private fun setUserDataAdapter() {
        linearLayout = LinearLayoutManager(this)
        binding.viewModel?.userDataEntity?.observe(this, Observer {
            if (it != null) {
                binding.rvUserData.apply {
                    adapter = UserDataAdapter(this@AddBuilderStormActivity, it)
                    layoutManager = linearLayout
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }
}