package com.rrt.rxjavademo.network.api;

import com.rrt.rxjavademo.model.ZhuangbiImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by LI on 2017/6/21.
 */

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> getZhuangbi(@Query("q") int query);
}
