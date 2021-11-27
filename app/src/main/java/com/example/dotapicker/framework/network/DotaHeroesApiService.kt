package com.example.dotapicker.framework.network

import com.example.root.data.Hero
import retrofit2.http.GET

interface DotaHeroesApiService {
    @GET("/heroStats")
    suspend fun getHeroes(): List<Hero>
}