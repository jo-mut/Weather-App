package com.el.j.weatherapi

import com.google.gson.annotations.SerializedName

data class Daily(@SerializedName("summary") var summary: String,
                 @SerializedName("icon") var icon: String,
                 @SerializedName("data") var data: Array<Map<String, String>>) {
}