package proxy;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 22:34
 */
public class ConcreteSubject implements Subject {
    @Override
    public void request() {
        System.out.println("执行");
    }
}
