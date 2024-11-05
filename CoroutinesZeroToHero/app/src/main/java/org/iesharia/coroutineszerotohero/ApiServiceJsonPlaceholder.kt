package org.iesharia.coroutineszerotohero

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>

    @GET("posts/{id}")
    suspend fun getPostById(@Path("id") postId: Int): Response<Post>
}

data class Post(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)
