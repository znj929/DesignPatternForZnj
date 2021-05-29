package bridge桥接模式;

/**
 * @Author: znj
 * @Date: 2021/5/29 0029 21:50
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction =new RefinedAbstraction(implementor);
        abstraction.execute();
    }
}
