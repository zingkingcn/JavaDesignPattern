package com.zingking.javadesignmode.chain.okhttp;

import com.zingking.javadesignmode.chain.okhttp.intercept.IInterceptor;

import java.util.ArrayList;
import java.util.List;


/**
 * 构建 okhttp 的客户端
 * 这里只提取的与拦截器相关的代码
 */
public class OkHttpClient {

    private List<IInterceptor> interceptorList;
    public OkHttpClient(List<IInterceptor> interceptorList) {
        this.interceptorList = interceptorList;
    }

    public List<IInterceptor> interceptors() {
        return interceptorList;
    }

    public static class Builder {
        private List<IInterceptor> interceptorList;
        private List<String> params;

        public Builder() {
            interceptorList = new ArrayList<>();
            params = new ArrayList<>();
        }

        /**
         * 添加拦截器处理者
         *
         * 相当于 "setNext()"
         * @param interceptor
         * @return
         */
        public Builder addInterceptor(IInterceptor interceptor) {
            interceptorList.add(interceptor);
            return this;
        }

        public OkHttpClient build() {
            OkHttpClient okHttpClient = new OkHttpClient(interceptorList);
            return okHttpClient;
        }
    }
}
