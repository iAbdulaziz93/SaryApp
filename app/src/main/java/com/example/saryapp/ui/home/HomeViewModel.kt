package com.example.saryapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.saryapp.logic.models.banner.BannerModel
import com.example.saryapp.logic.models.catalog.CatalogModel
import com.example.saryapp.logic.network.sary.factory.DataWrapper
import com.example.saryapp.logic.repositories.SaryRepository
import com.example.saryapp.utils.ext.getApiResponse
import kotlinx.coroutines.launch

class HomeViewModel(var saryRepository: SaryRepository) : ViewModel() {

    fun getBanners(): LiveData<DataWrapper<BannerModel>> {
        val dataWrapper = DataWrapper<BannerModel>()
        val data = MutableLiveData<DataWrapper<BannerModel>>()

        viewModelScope.launch {
            val (response, error) = saryRepository.getBanners().getApiResponse()

            if (response != null)
                dataWrapper.data = response
            else
                dataWrapper.exception = error

            data.value = dataWrapper
        }

        return data
    }

    fun getCatalog(): LiveData<DataWrapper<CatalogModel>> {
        val dataWrapper = DataWrapper<CatalogModel>()
        val data = MutableLiveData<DataWrapper<CatalogModel>>()

        viewModelScope.launch {
            val (response, error) = saryRepository.getCatalog().getApiResponse()

            if (response != null)
                dataWrapper.data = response
            else
                dataWrapper.exception = error

            data.value = dataWrapper
        }

        return data
    }
}