package com.example.rxjava.injection.module

import com.example.rxjava.network.PostApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object NetworkModule {

    @Provides
    @Singleton
    internal fun providePostApi(retrofit: Retrofit):PostApi =
        retrofit.create(PostApi::class.java)

}