package com.example.builderstorm.restApi;

import com.example.builderstorm.enitity.UserAssignedProjectResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("mobileapp/getUserAssignedProjects")
    Call<Object> getNoticeData();
}
