package com.example.saryapp.logic.network.sary.services.catalog

import com.example.saryapp.helpers.Constants
import com.example.saryapp.logic.models.catalog.CatalogModel
import retrofit2.Response
import retrofit2.http.GET

interface CatalogService {

    @GET(Constants.GET_CATALOG_ENDPOINT)
    suspend fun getCatalog(): Response<CatalogModel>
}