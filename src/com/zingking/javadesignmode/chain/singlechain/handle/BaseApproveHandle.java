package com.zingking.javadesignmode.chain.singlechain.handle;

import com.zingking.javadesignmode.chain.singlechain.bean.LeaveRequest;

/**
 * Copyright © www.zingking.cn
 * <p>
 * 抽象处理者
 *
 * @author Z.kai
 * @since 2022/06/06 15:17
 */
public abstract class BaseApproveHandle {
    private BaseApproveHandle handle;

    public void setNext(BaseApproveHandle handle){
        this.handle = handle;
    }

    public BaseApproveHandle getNext() {
        return handle;
    }

    public abstract void handleRequest(LeaveRequest o);

}
