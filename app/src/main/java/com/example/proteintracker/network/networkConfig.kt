package com.example.proteintracker.network

import com.example.proteintracker.model.DataItem
import com.example.proteintracker.model.ResponseAddPetani
import com.example.proteintracker.model.ResponseItem
import com.example.proteintracker.model.ResponsePetani
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

class NetworkConfig {
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.4/slim_tokobuah/public/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
    interface Users {
        @GET("users")
        fun getUsers(): Call<List<ResponseItem>>

        @GET("petani/")
        fun getPetaniAll(): Call<ResponsePetani>

        @POST("petani/{id}")
        fun addPetani(@Body req: DataItem): Call<ResponseAddPetani>

        @PUT("petani/{id}")
        fun updatepetani(@Path("id") id: Int, @Body req : DataItem): Call<ResponseAddPetani>

        @DELETE("petani/{id}")
        fun deletePetani(@Path("id") id : Int): Call<ResponseAddPetani>
    }