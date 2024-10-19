package com.news.newsapp.di

import com.news.newsapp.data.remote.NewsAPI
import com.news.newsapp.data.repository.NewRepositoryImpl
import com.news.newsapp.domain.repository.NewsRepository
import com.news.newsapp.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NewsModule {

    @Provides
    @Singleton
    fun providesNewsApi() : NewsAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsAPI::class.java)
    }

    @Provides
    @Singleton
    fun providesNewsAPIRepository(api: NewsAPI) : NewsRepository {
        return NewRepositoryImpl(api)
    }
}