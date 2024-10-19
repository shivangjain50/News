package com.news.newsapp.data.remote

import com.news.newsapp.data.remote.dto.NewsDTO
import retrofit2.http.GET

interface NewsAPI {

    @GET("everything/cnn.json")
    suspend fun getNews(): NewsDTO
}