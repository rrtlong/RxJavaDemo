package com.rrt.rxjavademo.network;

import com.rrt.rxjavademo.network.api.ZhuangbiApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LI on 2017/6/21.
 */

public class NetWork {
    public static ZhuangbiApi zhuangbiApi;
    public static ZhuangbiApi getZhuangbiApi(){
        if(zhuangbiApi != null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.zhuangbi.info/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            zhuangbiApi = retrofit.create(ZhuangbiApi.class);
        }
        return zhuangbiApi;
    }
}
