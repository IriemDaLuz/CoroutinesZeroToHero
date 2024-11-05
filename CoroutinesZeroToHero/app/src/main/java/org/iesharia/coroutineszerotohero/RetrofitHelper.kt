
package org.iesharia.coroutineszerotohero

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object `RetrofitHelper` {
    private const val URL = "https://jsonplaceholder.typicode.com/"

    private val retrofit =
        Retrofit
            .Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create()).build()

    fun getInstance():ApiServicesJsonPlaceholder{
        return retrofit.create(ApiServicesJsonPlaceholder::class.java)
    }
}
