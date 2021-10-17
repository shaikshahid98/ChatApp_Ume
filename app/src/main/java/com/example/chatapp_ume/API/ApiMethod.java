package com.example.chatapp_ume.API;

import com.example.chatapp_ume.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiMethod {
    @GET("api/Login/getuser")
    Call<UserModel> getUser();
}
