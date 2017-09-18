package com.example.user.sampleretrofithttplibraryapp;

import android.database.Observable;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);

//    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
//    Observable<SOAnswersResponse> getAnswers();
//
//    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
//    Observable<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}