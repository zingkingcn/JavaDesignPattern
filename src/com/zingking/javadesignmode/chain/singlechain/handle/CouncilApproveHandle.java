package com.zingking.javadesignmode.chain.singlechain.handle;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 审批委员会
 *
 * @author Z.kai
 * @since 2022/06/06 15:26
 */
public class CouncilApproveHandle extends BaseApproveHandle {

    @Override
    public void handleRequest(LeaveRequest o) {
        if (o.getDay() < 365) {
            System.out.println("审批委员会：批准请假");
        } else {
            if (getNext() != null) {
                System.out.println("审批委员会：超过365天，无法处理，交给后继者处理");
                getNext().handleRequest(o);
            } else {
                System.out.println("审批委员会：暂无审批人员");
            }
        }
    }
}