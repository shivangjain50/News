package com.news.newsapp.domain.use_case.get_news

import com.news.newsapp.data.remote.dto.Article
import com.news.newsapp.domain.model.News
import com.news.newsapp.domain.repository.NewsRepository
import com.news.newsapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetNewsUseCase @Inject constructor( private val repository: NewsRepository) {

    operator fun invoke()  : Flow<Resource<News>> = flow {
        try {
            emit(Resource.Loading())
            val news = repository.getNews().toNews()
            emit(Resource.Success(news))
        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch(e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}