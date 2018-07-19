package com.example.fahad.placeholder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fahad on 7/16/2018.
 */

public interface PostApi {

    @GET("posts")
    Call<List<PostBean>> getPost();
}
