package com.pramodk.myapp3.utils

import com.pramodk.myapp3.utils.Status.ERROR
import com.pramodk.myapp3.utils.Status.LOADING
import com.pramodk.myapp3.utils.Status.SUCCESS

data class Resource<out T>(
    val status: Status,     //used for success and failure or loading
    val data: T?,           // data from the website
    val message: String?    // message if we didn't receive the data
) {
    companion object {
        //taking data as parameter
        fun<T>success(data: T):Resource<T> = Resource(status = SUCCESS, data = data, message = null)
        //taking null data as a parameter
        fun <T>loading(data: T?): Resource<T> = Resource(status = LOADING, data = data, message = null)
        //taking null data and message as a parameter
        fun <T>error(data: T?, message: String): Resource<T> = Resource(status = ERROR, data = data, message = message)
    }
}