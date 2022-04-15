package com.example.saryapp.utils.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.saryapp.logic.repositories.SaryRepository
import com.example.saryapp.ui.home.HomeViewModel
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class HomeViewModelFactory @Inject constructor(private val saryRepository: SaryRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(HomeViewModel::class.java))
            HomeViewModel(this.saryRepository) as T
        else throw IllegalArgumentException("ViewModel not found.")
    }
}