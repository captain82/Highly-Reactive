package com.example.rxjava.network

import android.database.Observable
import com.example.rxjava.model.Post
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts():Observable<List<Post>>

}