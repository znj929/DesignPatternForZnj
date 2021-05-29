package bridge桥接模式;

/**
 * @Author: znj
 * @Date: 2021/5/28 0028 22:59
 */
public class ConcreteImplementor implements Implementor{

    @Override
    public void execute() {
        System.out.println("执行具体功能逻辑");
    }
}
