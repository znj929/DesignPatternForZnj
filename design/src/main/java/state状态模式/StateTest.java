package state状态模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:13
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new NewOrderState());
        context.execute(2);
        context.execute(3);
    }
}
