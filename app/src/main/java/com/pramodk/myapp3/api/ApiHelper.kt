package com.pramodk.myapp3.api

class ApiHelper(private val postApi: PostApi) {

    suspend fun getPhotos() = postApi.getPhotos()

}