package com.pramodk.myapp3.api

import com.pramodk.myapp3.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {

    @GET("/photos")
    suspend fun getPhotos():List<Post>

}