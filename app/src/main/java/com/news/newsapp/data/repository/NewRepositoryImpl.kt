package com.news.newsapp.data.repository

import com.news.newsapp.data.remote.NewsAPI
import com.news.newsapp.data.remote.dto.NewsDTO
import com.news.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewRepositoryImpl @Inject constructor(
    private val api: NewsAPI
) : NewsRepository {
    override suspend fun getNews(): NewsDTO {
        return api.getNews()
    }
}