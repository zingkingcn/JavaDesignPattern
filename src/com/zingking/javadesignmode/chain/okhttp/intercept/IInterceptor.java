package com.zingking.javadesignmode.chain.okhttp.intercept;

import com.zingking.javadesignmode.chain.okhttp.bean.Request;
import com.zingking.javadesignmode.chain.okhttp.bean.Response;

/**
 * 抽象的处理者，其实现类是属于链中的某一个具体的处理对象
 *
 * 在示例代码中
 * <code>
 * public class DeanApproveHandle extends BaseApproveHandle{
 *     @Override
 *     public void handleRequest(LeaveRequest o) { // 这里的相当于 IInterceptor 的 Response intercept(Chain chain);
 *         if (o.getDay() < 90) {
 *             System.out.println("院长：批准请假");
 *         } else {
 *             if (getNext() != null) {
 *                 System.out.println("院长：超过90天，无法处理，交给后继者处理");
 *                 getNext().handleRequest(o); // 这里实际上相当于 IInterceptor.Chain 的 Response proceed(Request request);
 *             } else {
 *                 System.out.println("院长：暂无审批人员");
 *             }
 *         }
 *     }
 * }
 * </code>
 *
 * 拦截器 IInterceptor 和 IInterceptor.Chain 是相当于把 handleRequest 拆成两步 intercept 和 Chain.proceed
 *
 * intercept 相当于传统覆写的方法 handleRequest，用来处理当前的请求
 *
 * Chain.proceed 相当于传统覆写的方法 handleRequest 实现类中将当前请求交给后继者的 getNext().handleRequest(o);
 *
 * 这样做解耦了'处理'和'传递'操作
 */
public interface IInterceptor {

    /**
     * 由具体处理者实现该方法，处理自己对应的业务逻辑
     * @param chain 包含了请求的对象
     * @return 响应值
     */
    Response intercept(Chain chain);

    /**
     * 链，用来串联起具体的处理对象，并管理调用顺序
     */
    interface Chain {

        /**
         * 得到链中传递的请求参数
         * @return 请求参数
         */
        Request request();

        /**
         * 将请求传递给下一个处理对象
         * <p> 相当于组装链的过程 "handleRequest" </p>
         * @param request 处理过的请求
         * @return 响应值
         */
        Response proceed(Request request);
    }

}
