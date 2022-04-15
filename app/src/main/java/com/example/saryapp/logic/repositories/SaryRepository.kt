package com.example.saryapp.logic.repositories

import com.example.saryapp.logic.models.banner.BannerModel
import com.example.saryapp.logic.models.catalog.CatalogModel
import com.example.saryapp.logic.network.sary.factory.ApiFactory
import com.example.saryapp.logic.network.sary.services.banner.BannerService
import com.example.saryapp.logic.network.sary.services.catalog.CatalogService
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SaryRepository @Inject constructor(apiFactory: ApiFactory) {

    private val mBannerService = apiFactory.saryApi.create(BannerService::class.java)
    private val mCatalogService = apiFactory.saryApi.create(CatalogService::class.java)

    suspend fun getBanners(): Response<BannerModel> {
        return mBannerService.getBanners()
    }

    suspend fun getCatalog(): Response<CatalogModel> {
        return mCatalogService.getCatalog()
    }
}