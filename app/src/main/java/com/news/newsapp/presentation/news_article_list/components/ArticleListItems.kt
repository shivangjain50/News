package com.news.newsapp.presentation.news_article_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.news.newsapp.data.remote.dto.Article


@Composable
fun ArticleListItem(
    article: Article,
    onItemClick: (Article) -> Unit

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { onItemClick(article) }
    )
    {
        AsyncImage(
            article.urlToImage,
            modifier = Modifier
                .fillMaxWidth(),
            contentDescription = article.title,
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            modifier = Modifier.padding(10.dp),
            text = article.title,
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(15.dp))
    }

}