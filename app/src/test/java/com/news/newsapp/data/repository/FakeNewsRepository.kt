package com.news.newsapp.data.repository

import com.news.newsapp.data.remote.dto.Article
import com.news.newsapp.data.remote.dto.NewsDTO
import com.news.newsapp.data.remote.dto.Source
import com.news.newsapp.domain.repository.NewsRepository

class FakeNewsRepository() : NewsRepository {

    private var article1 = Article(
        "Issy Ronald, CNN",
        "(CNN)\\\"We have a score to settle,\\\" Liverpool star Mo Salah tweeted after Real Madrid staged an extraordinary late comeback against Manchester City to set up a clash with the Reds in the Champions Leag… [+2830 chars]",
        "\"We have a score to settle,\\\" Liverpool star Mo Salah tweeted after Real Madrid staged an extraordinary late comeback against Manchester City to set up a clash with the Reds in the Champions League final on May 28.",
        "2022-05-05T10:06:14Z",
        Source("cnn", "CNN"),
        "God needs to come and explain it': How the football world reacted to Real Madrid's extraordinary Champions League semifinal victory",
        "https://www.cnn.com/2022/05/05/football/real-madrid-champions-league-reaction-liverpool-spt-intl/index.html",
        "https://cdn.cnn.com/cnnnext/dam/assets/220504173124-11-champions-league-semifinal-real-madrid-manchester-city-super-tease.jpg"
    )
    private var article2 = Article(
        "Issy Ronald, CNN",
        "(CNN)\\\"We have a score to settle,\\\" Liverpool star Mo Salah tweeted after Real Madrid staged an extraordinary late comeback against Manchester City to set up a clash with the Reds in the Champions Leag… [+2830 chars]",
        "\"We have a score to settle,\\\" Liverpool star Mo Salah tweeted after Real Madrid staged an extraordinary late comeback against Manchester City to set up a clash with the Reds in the Champions League final on May 28.",
        "2022-05-05T10:06:14Z",
        Source("cnn", "CNN"),
        "God needs to come and explain it': How the football world reacted to Real Madrid's extraordinary Champions League semifinal victory",
        "https://www.cnn.com/2022/05/05/football/real-madrid-champions-league-reaction-liverpool-spt-intl/index.html",
        "https://cdn.cnn.com/cnnnext/dam/assets/220504173124-11-champions-league-semifinal-real-madrid-manchester-city-super-tease.jpg"
    )
    private var articles = mutableListOf(article1, article2)
    private val newsDTO = NewsDTO(articles, "ok", 1)


    override suspend fun getNews(): NewsDTO {
        return newsDTO
    }
}