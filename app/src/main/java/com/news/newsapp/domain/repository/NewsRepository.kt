package com.news.newsapp.domain.repository

import com.news.newsapp.data.remote.dto.NewsDTO

interface NewsRepository {
    suspend fun getNews(): NewsDTO
}