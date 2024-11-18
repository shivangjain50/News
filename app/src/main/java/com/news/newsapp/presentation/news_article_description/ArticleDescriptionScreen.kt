package com.news.newsapp.presentation.news_article_description

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.news.newsapp.data.remote.dto.Article

@Composable
fun ArticleDescriptionScreen(article: Article?) {

    Box(modifier = Modifier.fillMaxSize()) {
        article?.let { article ->
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(20.dp)
            ) {
                item {
                    Column(
                        modifier = Modifier.fillMaxWidth(),

                        ) {
                        Text(
                            text = article.title,
                            style = MaterialTheme.typography.titleMedium,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(15.dp))
                        AsyncImage(
                            article.urlToImage,
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentDescription = article.description,
                            contentScale = ContentScale.FillBounds
                        )
                        Spacer(modifier = Modifier.height(15.dp))
                        Text(
                            text = article.description,
                            style = MaterialTheme.typography.bodyMedium,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            text = "Source - ${article.source.name}",
                            style = MaterialTheme.typography.bodyMedium,
                            overflow = TextOverflow.Ellipsis
                        )

                    }
                }
            }
        }

    }
}
