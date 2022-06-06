package com.zingking.javadesignmode.chain.singlechain;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;
import com.zingking.javadesignmode.chain.singlechain.handle.CouncilApproveHandle;
import com.zingking.javadesignmode.chain.singlechain.handle.DeanApproveHandle;
import com.zingking.javadesignmode.chain.singlechain.handle.ManagerApproveHandle;
import com.zingking.javadesignmode.chain.singlechain.handle.TeacherApproveHandle;

/**
 * Copyright © www.zingking.cn
 * <p>
 * TODO
 *
 * @author Z.kai
 * @since 2022/06/06 15:30
 */
public class Main {
    public static void main(String[] args){
        // 创建链
        TeacherApproveHandle teacherApproveHandle = new TeacherApproveHandle();
        ManagerApproveHandle managerApproveHandle = new ManagerApproveHandle();
        DeanApproveHandle deanApproveHandle = new DeanApproveHandle();
        CouncilApproveHandle councilApproveHandle = new CouncilApproveHandle();
        // 形成链
        teacherApproveHandle.setNext(managerApproveHandle);
        managerApproveHandle.setNext(deanApproveHandle);
        deanApproveHandle.setNext(councilApproveHandle);
        // 创建请求
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setDay(2598);
        // 开始处理
        teacherApproveHandle.handleRequest(leaveRequest);
    }
}
