package com.example.saryapp.logic.models.catalog

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CatalogModel(
    @SerializedName("message")
    @Expose
    var message: String? = null,

    @SerializedName("other")
    @Expose
    var other: Other? = null,

    @SerializedName("result")
    @Expose
    var result: List<Result>? = null,

    @SerializedName("status")
    @Expose
    var status: Boolean? = null
)

data class Other(
    @SerializedName("business_status")
    @Expose
    var businessStatus: BusinessStatus? = null,

    @SerializedName("header")
    @Expose
    var header: Header? = null,

    @SerializedName("show_special_order_view")
    @Expose
    var showSpecialOrderView: Boolean? = null,

    @SerializedName("show_vat")
    @Expose
    var showVat: Boolean? = null,

    @SerializedName("uncompleted_profile_settings")
    @Expose
    var uncompletedProfileSettings: UncompletedProfileSettings? = null
)

data class Result(
    @SerializedName("data")
    @Expose
    var `data`: List<Data>? = null,

    @SerializedName("data_type")
    @Expose
    var dataType: String? = null,

    @SerializedName("excluded_business_segments")
    @Expose
    var excludedBusinessSegments: List<Any>? = null,

    @SerializedName("group_id")
    @Expose
    var groupId: Int? = null,

    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("items_count")
    @Expose
    var itemsCount: Int? = null,

    @SerializedName("metadata")
    @Expose
    var metadata: MetadataXX? = null,

    @SerializedName("row_count")
    @Expose
    var rowCount: Int? = null,

    @SerializedName("show_more_enabled")
    @Expose
    var showMoreEnabled: Boolean? = null,

    @SerializedName("show_title")
    @Expose
    var showTitle: Boolean? = null,

    @SerializedName("subtitle")
    @Expose
    var subtitle: String? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null,

    @SerializedName("ui_type")
    @Expose
    var uiType: String? = null
)

data class BusinessStatus(
    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null
)

data class Header(
    @SerializedName("image")
    @Expose
    var image: String? = null,

    @SerializedName("type")
    @Expose
    var type: String? = null
)

data class UncompletedProfileSettings(
    @SerializedName("image")
    @Expose
    var image: String? = null,

    @SerializedName("is_completed_profile")
    @Expose
    var isCompletedProfile: Boolean? = null,

    @SerializedName("message")
    @Expose
    var message: String? = null,

    @SerializedName("show_tag")
    @Expose
    var showTag: Boolean? = null
)

data class Data(
    @SerializedName("cover")
    @Expose
    var cover: Any? = null,

    @SerializedName("deep_link")
    @Expose
    var deepLink: String? = null,

    @SerializedName("filters")
    @Expose
    var filters: List<Filter>? = null,

    @SerializedName("group_id")
    @Expose
    var groupId: Int? = null,

    @SerializedName("header")
    @Expose
    var header: Any? = null,

    @SerializedName("image")
    @Expose
    var image: String? = null,

    @SerializedName("metadata")
    @Expose
    var metadata: MetadataX? = null,

    @SerializedName("name")
    @Expose
    var name: String? = null
)

data class MetadataXX(
    @SerializedName("consumable_display")
    @Expose
    var consumableDisplay: Any? = null,

    @SerializedName("sub_title")
    @Expose
    var subTitle: String? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null
)

data class Filter(
    @SerializedName("filter_id")
    @Expose
    var filterId: Int? = null,

    @SerializedName("image")
    @Expose
    var image: Any? = null,

    @SerializedName("metadata")
    @Expose
    var metadata: Metadata? = null,

    @SerializedName("name")
    @Expose
    var name: String? = null
)

data class MetadataX(
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