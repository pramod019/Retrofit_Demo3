package com.pramodk.myapp3.repositoty

import com.pramodk.myapp3.api.ApiHelper

class Repository (private val apiHelper: ApiHelper){

    suspend fun getPhotos() = apiHelper.getPhotos()

}