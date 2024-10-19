package com.news.newsapp.presentation.news_article_list

import com.news.newsapp.data.remote.dto.Article

data class NewsArticleListState(
    val isLoading: Boolean = false,
    val articles: List<Article> = emptyList(),
    val error: String = ""
)