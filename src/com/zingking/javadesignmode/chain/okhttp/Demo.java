package com.zingking.javadesignmode.chain.okhttp;


import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.intercept.AInterceptor;
import com.zingking.javadesignmode.chain.okhttp.intercept.BInterceptor;

public class Demo {
    public static void main(String[] args){
        // 构建 httpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        // 创建链
        builder.addInterceptor(new AInterceptor());
        builder.addInterceptor(new BInterceptor());
        OkHttpClient client = builder.build();
        // 创建请求参数
        Request request = new Request();
        request.addParams("user=1");
        // 创建请求
        RealCall realCall = new RealCall(client, request);
        // 开始处理
        realCall.execute();
    }
}
