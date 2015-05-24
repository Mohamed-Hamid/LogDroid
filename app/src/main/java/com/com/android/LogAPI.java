package com.com.android;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by Mohamed on 4/27/2015.
 */
public interface LogAPI {

    @POST("/logs")
    void sendLog(@Body Log log, Callback<com.com.android.Log> cb);

}
