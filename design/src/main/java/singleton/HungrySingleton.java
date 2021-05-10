package singleton;

/**
 * 饿汉模式
 * @Author: znj
 * @Date: 2021/5/10 0010 22:49
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
    public void execute(){
        System.out.println("执行----------------->饿汉模式");
    }
}
