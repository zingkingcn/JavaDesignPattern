package com.zingking.javadesignmode.chain.okhttp.intercept;

import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.bean.Response;

/**
 * 具体的请求处理者 A
 */
public class AInterceptor implements IInterceptor {
    private static final String TAG = "AInterceptor";

    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(TAG + " 修改参数前 = " + request.getParams());
        request.addParams("a=2");
        System.out.println(TAG + " 修改参数后 = " + request.getParams());
        Response proceed = chain.proceed(request);
        System.out.println(TAG + " 修改结果前 = " + proceed.getResult());
        proceed.addResult("P=3");
        System.out.println(TAG + " 修改结果后 = " + proceed.getResult());
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return proceed;
    }
}
