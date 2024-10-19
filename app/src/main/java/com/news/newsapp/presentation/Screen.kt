package com.news.newsapp.presentation

sealed class Screen(val route: String) {
    data object ArticleListScreen: Screen("article_list_screen")
    data object ArticleDescriptionScreen: Screen("article_description_screen")
}