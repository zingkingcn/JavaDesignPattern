package com.zingking.javadesignmode.chain.doublechain;

import com.zingking.javadesignmode.chain.doublechain.bean.BaseResponse;
import com.zingking.javadesignmode.chain.doublechain.bean.LeaveRequest;
import com.zingking.javadesignmode.chain.doublechain.handle.CouncilApproveHandle;
import com.zingking.javadesignmode.chain.doublechain.handle.DeanApproveHandle;
import com.zingking.javadesignmode.chain.doublechain.handle.ManagerApproveHandle;
import com.zingking.javadesignmode.chain.doublechain.handle.TeacherApproveHandle;

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
        leaveRequest.setDay(35);
        // 开始处理
        BaseResponse baseResponse = teacherApproveHandle.handleRequest(leaveRequest);
        System.out.println(baseResponse.getOpinion());
    }
}
