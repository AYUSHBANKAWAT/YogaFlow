package com.example.myapplication.network


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
@GET("categories")
suspend fun getCategories(
    @Query("id")id:Int=4,
    @Query("name")name:String,
    @Query("level")level:String
):Response<com.example.myapplication.models.Response>

@GET("poses")
suspend fun Poses(
    @Query("id")id: Int=4,
    @Query("name")name: String,
    @Query("level")level: String
):Response<com.example.myapplication.models.Response>

}