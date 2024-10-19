package com.news.newsapp.presentation.news_article_description.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun SourceTitle(title: String) {

    Text(
        text = "Source - $title",
        style = MaterialTheme.typography.bodyMedium,
        overflow = TextOverflow.Ellipsis
    )

}