package ChainOfResponsibility责任链模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 23:59
 */
public class Client {
    public static void main(String[] args) {
        // 流程2 -> 流程1 - > 流程3
        Handler handler3 =  new ConcreteHandler3(null);
        Handler handler1 =  new ConcreteHandler1(handler3);
        Handler handler2 =  new ConcreteHandler2(handler1);
        handler2.execute();
    }
}
