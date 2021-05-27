package Compoent装饰器模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 22:49
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Compoent compoent =  new ConcreateCompoent();
        Decorator decorator = new Decorator(compoent);
        decorator.execute();
    }
}
