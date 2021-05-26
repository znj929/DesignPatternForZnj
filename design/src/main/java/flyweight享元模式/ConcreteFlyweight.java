package flyweight享元模式;

/**
 * @Author: znj
 * @Date: 2021/5/26 0026 23:31
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void execute() {
        System.out.println("执行");
    }
}
