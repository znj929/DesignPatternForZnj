package state状态模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:03
 */
public class NewOrderState implements State{
    @Override
    public void execute() {
        System.out.println("新建订单");
    }
}
