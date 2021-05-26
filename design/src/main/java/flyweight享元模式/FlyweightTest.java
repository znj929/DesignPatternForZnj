package flyweight享元模式;

/**
 * @Author: znj
 * @Date: 2021/5/26 0026 23:16
 */
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory= new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.get("1");
        flyweight1.execute();


        Flyweight flyweight2 = flyweightFactory.get("1");
        flyweight2.execute();
        //判断两个对象是否一样
        System.out.println(flyweight1 == flyweight2);
    }
}
