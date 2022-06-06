package com.zingking.javadesignmode.chain.doublechain.bean;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 响应结果
 *
 * @author Z.kai
 * @date 2021/03/01 14:39
 */
public class BaseResponse {
    private String opinion;
    private int code;

    public BaseResponse(String opinion, int code) {
        this.opinion = opinion + "\n";
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion+"\n";
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "opinion='" + opinion + '\'' +
                ", code=" + code +
                '}';
    }
}
