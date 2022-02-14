package com.fourapplecompose.thegoldprospector.network

import com.fourapplecompose.thegoldprospector.model.Gold
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface ApiService {

    @GET("goldlist.json")
    suspend fun getGold(): List<Gold>

    companion object{
        var apiService:ApiService? = null
        fun getInstance(): ApiService{
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://www.metals-api.com/api/latest?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)

            }
            return apiService!!
        }
    }

}