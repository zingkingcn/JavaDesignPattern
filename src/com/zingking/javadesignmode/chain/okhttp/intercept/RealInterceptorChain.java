package com.zingking.javadesignmode.chain.okhttp.intercept;

import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.bean.Response;

import java.util.List;

/**
 * 链的管理实现类
 */
public final class RealInterceptorChain implements IInterceptor.Chain {
    private final List<IInterceptor> interceptors;
    private final int index;
    private final Request request;

    /**
     * 实例化链管理类
     * @param interceptors 所有按顺序排好的拦截器对象集合
     * @param index 当前需要处理请求的拦截索引
     * @param request 请求对象
     */
    public RealInterceptorChain(List<IInterceptor> interceptors, int index, Request request) {
        this.interceptors = interceptors;
        this.index = index;
        this.request = request;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) {
        if (index > interceptors.size()) {
            throw new AssertionError();
        }
        // 紧挨着的下一个后继者链中拦截器为 interceptors 中的第 index + 1 个，相当于 getNext()
        RealInterceptorChain next = new RealInterceptorChain(interceptors, index + 1, request);
        // 当前处理者的对象 interceptors.get(index)
        IInterceptor iInterceptor = interceptors.get(index);
        // 将包含所有拦截器的后继者链 作为参数交给当前拦截器处理
        Response response = iInterceptor.intercept(next);
        return response;
    }
}
