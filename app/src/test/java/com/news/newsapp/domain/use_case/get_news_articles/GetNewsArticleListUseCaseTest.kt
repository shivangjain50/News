package com.news.newsapp.domain.use_case.get_news_articles

import com.news.newsapp.data.repository.FakeNewsRepository
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class GetNewsArticleListUseCaseTest {
   private lateinit var getNewsArticleListUseCase :GetNewsArticleListUseCase
   private lateinit var fakeNewsRepository: FakeNewsRepository

   @Before
   fun setup() {
       fakeNewsRepository = FakeNewsRepository()
       getNewsArticleListUseCase = GetNewsArticleListUseCase(fakeNewsRepository)
   }

    @Test
    fun `Get Article List, size of article list return` (): Unit = runBlocking{
        val count = getNewsArticleListUseCase().count()
        assertTrue(count == 2)
    }

}