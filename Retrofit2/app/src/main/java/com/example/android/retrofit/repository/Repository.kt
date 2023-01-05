package com.example.android.retrofit.repository

import com.example.android.retrofit.api.RetrofitInstance
import com.example.android.retrofit.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost() : Response<Post> {
      return RetrofitInstance.api.getPost()
    }
}