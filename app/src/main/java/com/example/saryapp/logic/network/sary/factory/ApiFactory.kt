package com.example.saryapp.logic.network.sary.factory

import androidx.lifecycle.Observer
import com.example.saryapp.helpers.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class ApiFactory @Inject constructor() {

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .addNetworkInterceptor {
            it.proceed(
                it.request().newBuilder().addHeader(
                    Constants.DEVICE_TYPE_HEADER_NAME,
                    Constants.DEVICE_TYPE_HEADER_VALUE
                )
                    .addHeader(
                        Constants.APP_VERSION_HEADER_NAME,
                        Constants.APP_VERSION_HEADER_VALUE
                    )
                    .addHeader(
                        Constants.ACCEPT_LANGUAGE_HEADER_NAME,
                        Constants.ACCEPT_LANGUAGE_HEADER_VALUE
                    )
                    .addHeader(Constants.PLATFORM_HEADER_NAME, Constants.PLATFORM_HEADER_VALUE)
                    .addHeader(
                        Constants.AUTHORIZATION_HEADER_NAME,
                        Constants.AUTHORIZATION_HEADER_VALUE
                    )
                    .build()
            )
        }
        .build()

    val saryApi: Retrofit
        get() = Retrofit.Builder()
            .baseUrl(Constants.SARY_STAGING_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
}

data class DataWrapper<T>(
    var data: T? = null,
    var exception: String? = null
)

class ApiObserver<T>(private val changeListener: ChangeListener<T>) : Observer<DataWrapper<T>> {
    override fun onChanged(dataWrapper: DataWrapper<T>?) {
        if (dataWrapper != null) {
            when {
                dataWrapper.data != null -> changeListener.onSuccess(dataWrapper.data!!)
                dataWrapper.exception != null -> changeListener.onFailure(dataWrapper.exception!!)
                else -> changeListener.onSuccess(null)
            }
        }
    }

    interface ChangeListener<T> {
        fun onSuccess(dataWrapper: T?)
        fun onFailure(exception: String?)
    }
}