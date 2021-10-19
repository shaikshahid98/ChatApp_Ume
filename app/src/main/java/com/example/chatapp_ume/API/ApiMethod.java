package com.example.chatapp_ume.API;

import com.example.chatapp_ume.Model.UserModel;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiMethod {
    @GET("api/Login/getuser")
    Call<UserModel> getUser(@Query("phoneNumber") String phoneNumber, @Query("password") String password);


}
