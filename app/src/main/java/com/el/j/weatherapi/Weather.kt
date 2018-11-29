package com.el.j.weatherapi

import android.database.Observable
import com.google.gson.annotations.SerializedName

data class Weather(@SerializedName("latitude") var latitude: String,
                   @SerializedName("longitude") var longitude: String,
                   @SerializedName("timezone") var timezone: String,
                   @SerializedName("currently") var currently: Map<String, String>,
                   @SerializedName("daily") var daily: Daily){



//  @SerializedName("latitude")
//  lateinit var latitude: String
//  @SerializedName("longitude")
//  lateinit var longitude: String
//  @SerializedName("timezone")
//  lateinit var timezone: String
//  @SerializedName("currently")
//  var currently: String? = null

}