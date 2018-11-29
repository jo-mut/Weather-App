package com.el.j.weatherapi

import com.google.gson.annotations.SerializedName

class City {
    @SerializedName("id")
    var id: String? = null
    @SerializedName("name")
    var name: String? = null

}

data class Data(@SerializedName("latitude") var lat: String,
                @SerializedName("longitude") var longitude: String) {

}