package com.zingking.javadesignmode.chain.okhttp.bean;

/**
 * 责任链中等待被处理的对象
 */
public class Request {
    private final StringBuffer params;
    public Request(){
        params = new StringBuffer();
    }

    public String getParams() {
        return params.toString();
    }

    public void addParams(String param) {
        params.append(":").append(param);
    }
}
