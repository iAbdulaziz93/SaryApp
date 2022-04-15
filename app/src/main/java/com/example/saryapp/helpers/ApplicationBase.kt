package com.example.saryapp.helpers

import android.app.Application
import com.example.saryapp.di.ApplicationGraph
import com.example.saryapp.di.DaggerApplicationGraph

class ApplicationBase : Application() {

    lateinit var applicationGraph: ApplicationGraph

    override fun onCreate() {
        super.onCreate()

        applicationGraph = DaggerApplicationGraph.builder().build()!!
    }
}