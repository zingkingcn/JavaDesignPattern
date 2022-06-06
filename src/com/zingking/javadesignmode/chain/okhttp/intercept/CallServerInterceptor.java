package com.zingking.javadesignmode.chain.okhttp.intercept;


import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.bean.Response;

/**
 * 链中的最后一环即最后一个处理对象，在 okhttp 中是真正请求网络的
 */
public class CallServerInterceptor implements IInterceptor {
    private static final String TAG = "CallServerInterceptor";

    @Override
    public Response intercept(Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();

        String params = request.getParams();
        System.out.println("");
        System.out.println("===================================================================");
        System.out.println(TAG + ",intercept: 最终请求参数 = " + params);
        System.out.println("===================================================================");

        Response response = new Response();
        response.addResult("异步开启线程请求网络，得到返回的结果");

        System.out.println("===================================================================");
        System.out.println(TAG + ",intercept: 服务器返回的结果 = " + response.getResult());
        System.out.println("===================================================================");


        return response;
    }
}
