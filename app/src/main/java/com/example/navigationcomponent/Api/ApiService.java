package com.example.navigationcomponent.Api;

import com.example.navigationcomponent.Model.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search")
    Call<DataModel> getData(@Query("ll") String lat,
                            @Query("oauth_token") String oauth_token,
                            @Query("v") String v);

}
