package state状态模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:03
 */
public class ApprovedOrderState implements State{
    @Override
    public void execute() {
        System.out.println("审批完成订单");
    }
}
