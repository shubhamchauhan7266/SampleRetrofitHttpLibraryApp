package com.example.user.sampleretrofithttplibraryapp;

class ApiUtils {

    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
