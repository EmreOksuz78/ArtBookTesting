package com.emreoksuz.artbooktesting.api

import com.emreoksuz.artbooktesting.model.ImageResponse
import com.emreoksuz.artbooktesting.util.Util.API_KEY
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery : String,
        @Query("key") apiKey : String = API_KEY
    ): retrofit2.Response<ImageResponse>
}