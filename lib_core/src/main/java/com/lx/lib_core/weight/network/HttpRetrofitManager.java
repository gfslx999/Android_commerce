package com.lx.lib_core.weight.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 10:29
 *@params : 
 *@description:
 */
class HttpRetrofitManager {

    private static HttpRetrofitManager instance;
    private Retrofit retrofit;
    private String oldUrl;

    public static HttpRetrofitManager getInstance() {
        if(instance == null) {
            instance = new HttpRetrofitManager();
        }
        return instance;
    }

    public Retrofit getRetrofit(String url) {
        if(retrofit == null || !oldUrl.equals(url)) {
            oldUrl = url;
            createRetrofit();
        }
        return retrofit;
    }

    private void createRetrofit() {
        //拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //客户端
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.writeTimeout(30, TimeUnit.SECONDS);
        clientBuilder.readTimeout(30, TimeUnit.SECONDS);
        clientBuilder.connectTimeout(30, TimeUnit.SECONDS);
        clientBuilder.addInterceptor(httpLoggingInterceptor);

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(oldUrl);
        builder.client(clientBuilder.build());
        builder.addConverterFactory(GsonConverterFactory.create());
        builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());

        retrofit = builder.build();
    }

}
