package com.zingking.javadesignmode.chain.singlechain.handle;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;

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
    public void handleRequest(LeaveRequest o) {
        if (o.getDay() < 7) {
            System.out.println("班主任：批准请假");
        } else {
            if (getNext() != null) {
                System.out.println("班主任：超过7天，无法处理，交给后继者处理");
                getNext().handleRequest(o);
            } else {
                System.out.println("班主任：暂无审批人员");
            }
        }
    }
}
