package com.example.android.retrofit.api

import com.example.android.retrofit.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    @GET("/posts/1")
    suspend fun getPost() : Response<Post>

}