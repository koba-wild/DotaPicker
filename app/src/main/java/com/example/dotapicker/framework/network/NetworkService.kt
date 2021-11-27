package com.example.dotapicker.framework.network

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object Retrofit {
    const val BASE_URL = "https://api.opendota.com/api/"
    fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun buildApiService(): DotaHeroesApiService =
        buildRetrofit().create(DotaHeroesApiService::class.java)
}