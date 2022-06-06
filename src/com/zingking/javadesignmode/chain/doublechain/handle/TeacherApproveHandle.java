package com.zingking.javadesignmode.chain.doublechain.handle;

import com.zingking.javadesignmode.chain.doublechain.bean.BaseResponse;
import com.zingking.javadesignmode.chain.doublechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 班主任处理
 *
 * @author Z.kai
 * @since 2022/06/06 15:20
 */
public class TeacherApproveHandle extends BaseApproveHandle {

    @Override
    public BaseResponse handleRequest(LeaveRequest o) {
        if (o.getDay() < 7) {
            System.out.println("班主任：批准请假");
            return new BaseResponse("班主任：同意", 1);
        } else {
            if (getNext() != null) {
                System.out.println("班主任：超过7天，无法处理，交给后继者处理");
                BaseResponse response = getNext().handleRequest(o);
                // 根据后继者的响应结果来进行不同处理
                if (response.getCode() == 1) {
                    response.setOpinion(response.getOpinion() + "班主任：同意");
                } else {
                    response.setOpinion(response.getOpinion() + "班主任：拒绝");
                }
                return response;
            } else {
                System.out.println("班主任：暂无审批人员");
                return new BaseResponse("班主任：拒绝", 0);
            }
        }
    }
}
