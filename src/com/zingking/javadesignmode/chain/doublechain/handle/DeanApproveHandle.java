package com.zingking.javadesignmode.chain.doublechain.handle;

import com.zingking.javadesignmode.chain.doublechain.bean.BaseResponse;
import com.zingking.javadesignmode.chain.doublechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 院长审批
 *
 * @author Z.kai
 * @since 2022/06/06 15:25
 */
public class DeanApproveHandle extends BaseApproveHandle {
    @Override
    public BaseResponse handleRequest(LeaveRequest o) {
        if (o.getDay() < 90) {
            System.out.println("院长：批准请假");
            return new BaseResponse("院长：同意", 1);
        } else {
            if (getNext() != null) {
                System.out.println("院长：超过90天，无法处理，交给后继者处理");
                BaseResponse response = getNext().handleRequest(o);
                // 根据后继者的响应结果来进行不同处理
                if (response.getCode() == 1) {
                    response.setOpinion(response.getOpinion() + "院长：同意");
                } else {
                    response.setOpinion(response.getOpinion() + "院长：拒绝");
                }
                return response;
            } else {
                System.out.println("院长：暂无审批人员");
                return new BaseResponse("院长：拒绝", 0);
            }
        }
    }
}
