package com.arunrk.retrofit2;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("index.php")
    Call<ApiResponse> getSupplier(@Field("action") String action);

}
