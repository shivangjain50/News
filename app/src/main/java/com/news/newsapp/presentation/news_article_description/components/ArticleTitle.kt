package com.news.newsapp.presentation.news_article_description.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import com.news.newsapp.data.remote.dto.Article


@Composable
fun ArticleTitle(title: String) {

    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        overflow = TextOverflow.Ellipsis
    )

}