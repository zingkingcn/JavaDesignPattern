package com.zingking.javadesignmode.chain.okhttp;

import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.bean.Response;
import com.zingking.javadesignmode.chain.okhttp.intercept.CallServerInterceptor;
import com.zingking.javadesignmode.chain.okhttp.intercept.IInterceptor;
import com.zingking.javadesignmode.chain.okhttp.intercept.RealInterceptorChain;

import java.util.ArrayList;
import java.util.List;

/**
 * 真正执行网络请求的对象
 */
public class RealCall {
    final OkHttpClient client;
    final Request originalRequest;

    /**
     * 实例化网络请求对象
     * @param client 网络请求管理类
     * @param originalRequest 原始请求
     */
    public RealCall(OkHttpClient client, Request originalRequest) {
        this.client = client;
        this.originalRequest = originalRequest;
    }

    /**
     * 对外暴露的执行方法
     * @return 响应值
     */
    public Response execute() {
        return getResponseWithInterceptorChain();
    }

    /**
     * 开始责任链的处理
     * @return 响应值
     */
    Response getResponseWithInterceptorChain() {

        // Build a full stack of interceptors.
        List<IInterceptor> interceptors = new ArrayList<>();
        interceptors.addAll(client.interceptors());
        interceptors.add(new CallServerInterceptor());

        IInterceptor.Chain chain = new RealInterceptorChain(interceptors, 0, originalRequest);

        return chain.proceed(originalRequest);
    }
}
