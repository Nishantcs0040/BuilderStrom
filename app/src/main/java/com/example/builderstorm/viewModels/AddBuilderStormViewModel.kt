package com.example.builderstorm.viewModels

import android.annotation.SuppressLint
import android.net.DnsResolver
import android.net.DnsResolver.Callback
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.builderstorm.enitity.UserData
import com.example.builderstorm.itemView.ItemProvider
import com.example.builderstorm.itemView.UserDataItemViewModel
import com.example.builderstorm.restApi.ApiBuilder
import com.example.builderstorm.restApi.ApiInterface
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import kotlin.math.log

class AddBuilderStormViewModel : ViewModel(), UserDataItemViewModel.UserDataItemListener {
    val userDataEntity = MutableLiveData<ArrayList<ItemProvider>>()

    init {
        callApi()
    }

    private fun callApi() {
        val api = ApiBuilder().buildService(ApiInterface::class.java)
        api.noticeData.enqueue(@RequiresApi(Build.VERSION_CODES.Q) object : Callback<Any>,
            retrofit2.Callback<Any> {
            override fun onAnswer(p0: Any, p1: Int) {
                TODO("Not yet implemented")
            }

            override fun onError(p0: DnsResolver.DnsException) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<Any>, response: Response<Any>
            ) {
                if (response.isSuccessful) {
                    val data = response.body()
                    setUserProjectData(data)
                }
            }

            override fun onFailure(call: Call<Any>, t: Throwable) {
                Log.d("Adduserdata", "Throwable: ${t.message.toString()}")
            }
        })
    }

    @SuppressLint("SuspiciousIndentation")
    private fun setUserProjectData(data: Any?) {
        val jsonInString = Gson().toJson(data)
        val mJsonObject = JSONObject(jsonInString)
        val data: JSONObject = mJsonObject.getJSONObject("data")
        val userArray: JSONArray = data.getJSONArray("user_projects")
        Log.d("AddUserdata", "setUserProjectData: ${userArray.length()}")
        val userData = ArrayList<UserData>()
        for (i in 0 until userArray.length()) {
            val uid = userArray.getJSONObject(i).getString("uid")
            val name = userArray.getJSONObject(i).getString("username")
            val contact = userArray.getJSONObject(i).getString("contact")
            val address = userArray.getJSONObject(i).getString("address")
            userData.add(UserData(uid, name, contact, address))
        }

        val apiData = ArrayList<ItemProvider>()
        for (i in userData) {
            if (!i.name.equals("") && !i.contact.equals("") && !i.address.equals("")) apiData.add(
                UserDataItemViewModel(i, this)
            )
        }
        userDataEntity.value = apiData
    }

    override fun onclick(itemsViewModel: UserDataItemViewModel) {
    }
}