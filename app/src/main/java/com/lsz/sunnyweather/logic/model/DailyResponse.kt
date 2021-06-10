package com.lsz.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName
import java.sql.Date

data class DailyResponse(val status: String, val result: Result) {

    data class Result(val daily: Daily)

    data class Daily(val temeperature: List<Temeperature>, val skycon: List<Skycon>,@SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temeperature(val max: Float,val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing:List<LifeDescription>, val ultraviolet: List<LifeDescription>,val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)
}