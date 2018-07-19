package com.example.fahad.placeholder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fahad on 7/19/2018.
 */

public class PostService {
    public static PostApi getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(PostApi.class);
    }
}
