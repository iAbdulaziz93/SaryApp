package com.example.saryapp.logic.models.banner

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BannerModel(
    @SerializedName("result")
    @Expose
    var result: List<Result>? = null,

    @SerializedName("status")
    @Expose
    var status: Boolean? = null
)

data class Result(
    @SerializedName("branches")
    @Expose
    var branches: List<Int>? = null,

    @SerializedName("button_text")
    @Expose
    var buttonText: String? = null,

    @SerializedName("cities")
    @Expose
    var cities: List<Int>? = null,

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null,

    @SerializedName("description")
    @Expose
    var description: String? = null,

    @SerializedName("expiry_date")
    @Expose
    var expiryDate: String? = null,

    @SerializedName("expiry_status")
    @Expose
    var expiryStatus: Boolean? = null,

    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("image")
    @Expose
    var image: String? = null,

    @SerializedName("is_available")
    @Expose
    var isAvailable: Boolean? = null,

    @SerializedName("level")
    @Expose
    var level: String? = null,

    @SerializedName("link")
    @Expose
    var link: String? = null,

    @SerializedName("metadata")
    @Expose
    var metadata: Metadata? = null,

    @SerializedName("photo")
    @Expose
    var photo: String? = null,

    @SerializedName("priority")
    @Expose
    var priority: Int? = null,

    @SerializedName("promo_code")
    @Expose
    var promoCode: String? = null,

    @SerializedName("start_date")
    @Expose
    var startDate: String? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null
)

data class Metadata(
    @SerializedName("consumable_display")
    @Expose
    var consumableDisplay: Any? = null,

    @SerializedName("sub_title")
    @Expose
    var subTitle: Any? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null
)