package com.example.saryapp.logic.network.sary.services.banner

import com.example.saryapp.helpers.Constants
import com.example.saryapp.logic.models.banner.BannerModel
import retrofit2.Response
import retrofit2.http.GET

interface BannerService {

    @GET(Constants.GET_BANNERS_ENDPOINT)
    suspend fun getBanners(): Response<BannerModel>
}