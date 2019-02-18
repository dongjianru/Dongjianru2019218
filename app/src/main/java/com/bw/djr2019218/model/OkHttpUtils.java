package com.bw.djr2019218.model;

import android.util.Log;

import java.security.Key;
import java.util.Map;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:19:46
 * @Description:
 */
public class OkHttpUtils {

    public static OkHttpUtils utils=null;

    private OkHttpUtils(){}
    public static OkHttpUtils getInstance(){
        if (utils==null)
        {
            utils = new OkHttpUtils();
             return utils;
        }
else {
            return utils;
        }
}
private static Interceptor myInterceptor(){
    HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
        @Override
        public void log(String message) {
            Log.i("xxx","拦截"+message);
        }
    });
        return interceptor;
}
public static  void doGet(String url, Callback callback){
        OkHttpClient client=new  OkHttpClient.Builder()
                .addInterceptor(myInterceptor())
                .build();
    Request request=new  Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
}
public static  void doPost(String url,Map<String,String> can, Callback callback){
        OkHttpClient client=new  OkHttpClient.Builder()
                .addInterceptor(myInterceptor())
                .build();
    FormBody.Builder builder=new FormBody.Builder();
    for (String key:can.keySet()){
        builder.add(key,can.get(key));
    }
        Request request=new  Request.Builder().url(url).post(builder.build()).build();
        client.newCall(request).enqueue(callback);
    }

}
