package com.news.newsapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.news.newsapp.data.remote.dto.Article
import com.news.newsapp.presentation.news_article_description.ArticleDescriptionScreen
import com.news.newsapp.presentation.news_article_list.ArticleListScreen
import com.news.newsapp.presentation.ui.theme.theme.NewsAppTheme
import com.news.newsapp.utils.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.ArticleListScreen.route
                    ) {
                        composable(
                            route = Screen.ArticleListScreen.route
                        ) {
                            ArticleListScreen(navController)
                        }
                        composable(
                            route = Screen.ArticleDescriptionScreen.route,
                        ) {
                            val article =
                                navController.previousBackStackEntry?.savedStateHandle?.get<Article>(
                                    Constants.ARTICLE
                                )
                            ArticleDescriptionScreen(article)
                        }
                    }
                }
            }
        }
    }
}


