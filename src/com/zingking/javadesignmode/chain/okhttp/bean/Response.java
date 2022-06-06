package com.zingking.javadesignmode.chain.okhttp.bean;

/**
 * 响应值
 */
public class Response {
    private final StringBuffer result;

    public Response(){
        result = new StringBuffer();
    }
    public String getResult() {
        return result.toString();
    }

    public void addResult(String result) {
        this.result.append(":").append(result);
    }
}
