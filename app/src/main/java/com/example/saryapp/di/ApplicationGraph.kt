package com.example.saryapp.di

import com.example.saryapp.logic.repositories.SaryRepository
import com.example.saryapp.ui.home.HomeActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [], dependencies = [])
interface ApplicationGraph {

    @Component.Builder
    interface Builder {

        fun build(): ApplicationGraph?
    }

    fun repository(): SaryRepository

    fun inject(activity: HomeActivity)
}