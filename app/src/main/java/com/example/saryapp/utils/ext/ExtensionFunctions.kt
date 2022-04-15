package com.example.saryapp.utils.ext

import retrofit2.Response

fun <T> Response<T>.getApiResponse(): Pair<T?, String?> {
    if (this.isSuccessful) {
        this.body()?.let {
            return Pair(this.body(), null)
        }
    }
    return Pair(
        null,
        "Something went wrong! Please, try again later."
    )
}