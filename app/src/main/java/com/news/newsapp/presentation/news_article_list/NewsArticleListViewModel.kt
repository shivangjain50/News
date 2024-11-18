package com.news.newsapp.presentation.news_article_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.news.newsapp.domain.use_case.get_news_articles.GetNewsArticleListUseCase
import com.news.newsapp.utils.Constants
import com.news.newsapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsArticleListViewModel @Inject constructor(
    private val getNewsArticleListUseCase: GetNewsArticleListUseCase
) : ViewModel() {

    private val _state = mutableStateOf(NewsArticleListState())
    val state: State<NewsArticleListState> = _state

    init {
        getNewsArticleList()
    }

    private fun getNewsArticleList() {
        getNewsArticleListUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = NewsArticleListState(articles = result.data ?: emptyList())
                }

                is Resource.Error -> {
                    _state.value = NewsArticleListState(
                        error = result.message ?: Constants.UNEXPECTED_ERROR
                    )
                }

                is Resource.Loading -> {
                     _state.value = NewsArticleListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}