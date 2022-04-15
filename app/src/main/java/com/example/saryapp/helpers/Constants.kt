package com.example.saryapp.helpers

object Constants {

    // Headers.
    const val DEVICE_TYPE_HEADER_NAME = "Device-Type"
    const val DEVICE_TYPE_HEADER_VALUE = "android"
    const val APP_VERSION_HEADER_NAME = "App-Version"
    const val APP_VERSION_HEADER_VALUE = "5.5.0.0.0"
    const val ACCEPT_LANGUAGE_HEADER_NAME = "Accept-Language"
    const val ACCEPT_LANGUAGE_HEADER_VALUE = "en"
    const val PLATFORM_HEADER_NAME = "Platform"
    const val PLATFORM_HEADER_VALUE = "FLAGSHIP"
    const val AUTHORIZATION_HEADER_NAME = "Authorization"
    const val AUTHORIZATION_HEADER_VALUE = "token eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MjgxNTEyLCJ1c2VyX3Bob25lIjoiOTY2NTkxMTIyMzM0In0.phRQP0e5yQrCVfZiN4YlkI8NhXRyqa1fGRx5rvrEv0o"

    // URLs.
    const val SARY_STAGING_BASE_URL = "https://staging.sary.to"

    // Endpoints.
    const val GET_BANNERS_ENDPOINT = "/api/v2.5.1/baskets/325514/banners"
    const val GET_CATALOG_ENDPOINT = "/api/baskets/325514/catalog"
}