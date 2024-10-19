package com.news.newsapp.presentation.news_article_description

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.news.newsapp.data.remote.dto.Article
import com.news.newsapp.presentation.news_article_description.components.ArticleDescription
import com.news.newsapp.presentation.news_article_description.components.ArticleImage
import com.news.newsapp.presentation.news_article_description.components.ArticleTitle
import com.news.newsapp.presentation.news_article_description.components.SourceTitle

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
                        ArticleTitle(article.title)
                        Spacer(modifier = Modifier.height(15.dp))
                        ArticleImage(article.urlToImage)
                        Spacer(modifier = Modifier.height(15.dp))
                        ArticleDescription(article.description)
                        Spacer(modifier = Modifier.height(30.dp))
                        SourceTitle(article.source.name)

                    }
                }
            }
        }

    }
}
