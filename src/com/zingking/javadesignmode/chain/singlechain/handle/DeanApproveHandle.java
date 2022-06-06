package com.zingking.javadesignmode.chain.singlechain.handle;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 院长审批
 *
 * @author Z.kai
 * @since 2022/06/06 15:25
 */
public class DeanApproveHandle extends BaseApproveHandle{
    @Override
    public void handleRequest(LeaveRequest o) {
        if (o.getDay() < 90) {
            System.out.println("院长：批准请假");
        } else {
            if (getNext() != null) {
                System.out.println("院长：超过90天，无法处理，交给后继者处理");
                getNext().handleRequest(o);
            } else {
                System.out.println("院长：暂无审批人员");
            }
        }
    }
}
