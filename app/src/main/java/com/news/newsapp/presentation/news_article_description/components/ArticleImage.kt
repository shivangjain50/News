package com.news.newsapp.presentation.news_article_description.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage

@Composable
fun ArticleImage(url: String) {
    AsyncImage(
        url,
        modifier = Modifier
            .fillMaxWidth(),
        contentDescription = url,
        contentScale = ContentScale.FillBounds
    )
}