package com.news.newsapp.data.remote.dto

import com.news.newsapp.domain.model.News

data class NewsDTO(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
) {
    fun toNews(): News {
        return News(
            articles = articles
        )
    }
}