package com.el.j.weatherapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private var API_KEY = "b2166d716755281bf51cc81048d0596f"
    private var lat: String = "37.8267"
    private var long: String = "-122.4233"
    private var country: String = "America"
    private var city: String = "New_York"
    private var id: String = "524901"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofit: Retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.darksky.net/forecast/")
                .build()


        var weatherService = retrofit.create(WeatherService::class.java)
        var call = weatherService.getByCoordinates(API_KEY, lat, long)

        call.enqueue(object: Callback<Weather> {
            override fun onFailure(call: Call<Weather>?, t: Throwable?) {
                Log.d("weather conditions", t.toString())
            }

            override fun onResponse(call: Call<Weather>?, response: Response<Weather>?) {
                if (response != null){
                    var latitude: String = response.body().latitude
                    var longitude: String = response.body().longitude
                    var currently: Map<String, String> = response.body().currently;
                    var daily: Daily = response.body().daily
                    var summary: String = response.body().daily.summary
                    Log.d("weather latitude", latitude)
                    Log.d("weather longitude", longitude)
                    Log.d("weather currently", currently.toString())
                    Log.d("weather daily", daily.toString())
                    Log.d("weather sammary", summary)

                }else{
                    Log.d("request url", response.toString())
                }
            }
        })

    }
}
