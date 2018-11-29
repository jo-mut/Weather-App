package com.el.j.weatherapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface WeatherService {

    @GET("{key}/{lat},{log}")
    fun getByCoordinates(@Path("key") key: String,
                         @Path("lat") lat: String,
                         @Path("log") log: String): Call<Weather>


}