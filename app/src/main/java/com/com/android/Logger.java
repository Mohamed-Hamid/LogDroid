package com.com.android;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Mohamed on 4/27/2015.
 */

public class Logger {
    public static void sendData(String appName, String contents) {
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://jolly-good-thunder-20-138293.euw1-2.nitrousbox.com")
                .build();

        LogAPI api = adapter.create(LogAPI.class);

        com.com.android.Log log = new com.com.android.Log();
        log.setApp_name(appName);
        log.setContent(contents);

        api.sendLog(log, new Callback<com.com.android.Log>() {
            @Override
            public void success(com.com.android.Log log, Response response) {

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
