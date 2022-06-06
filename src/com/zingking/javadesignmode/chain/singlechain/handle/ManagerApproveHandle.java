package com.zingking.javadesignmode.chain.singlechain.handle;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 系主任审批
 *
 * @author Z.kai
 * @since 2022/06/06 15:24
 */
public class ManagerApproveHandle extends BaseApproveHandle{

    @Override
    public void handleRequest(LeaveRequest o) {
        if (o.getDay() < 31) {
            System.out.println("系主任：批准请假");
        } else {
            if (getNext() != null) {
                System.out.println("系主任：超过31天，无法处理，交给后继者处理");
                getNext().handleRequest(o);
            } else {
                System.out.println("系主任：暂无审批人员");
            }
        }
    }
}
