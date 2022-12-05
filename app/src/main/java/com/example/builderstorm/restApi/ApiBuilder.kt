package com.example.builderstorm.restApi

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiBuilder {
    val token =
        "eyJ0eXBlIjoiQlMiLCJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzaXRlaWQiOiJkbFZQV0V0aEwzcG1SMkpFUVc1NFpsYzJaREpSWnowOSIsImRldmljZW5vIjoiWm1OQmVtOTZVVEJNT0RWc1NqSmhSRFl4V0c4dlppc3hTSEJNVjI5NE1FZEtjblpzYlZaTGVrNWFPRDA9IiwiY2xpZW50bmFtZSI6ImF6RXZOU3Q0VG1aSk1rTTBSR1V5ZUVKMk1GUkJUakZTWnpsMVNubGhNRUphTlZWdk9HczVlVko2T0QwPSIsInVzZXJpZCI6IlJuUnhhbVI0U1hkUVdrdElja1ZMVWt0eVMyRjBRVDA5In0.Fg5JbggGjDSqu4L3xlD7XofiKCnOon_MlCeRzU1UWQI"
    private val client = OkHttpClient.Builder().addInterceptor(object : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response {
            val request: Request =
                chain.request().newBuilder().addHeader("authToken", token).build()
            return chain.proceed(request)
        }
    }).build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://development-mobile.builderstorm.com") // change this IP for testing by your actual machine IP
        .addConverterFactory(GsonConverterFactory.create()).client(client).build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}