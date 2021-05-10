package singleton;

/**
 * 饱汉模式（线程不安全）
 * @Author: znj
 * @Date: 2021/5/10 0010 22:49
 */
public class UnsafeFullSingleton {

    private static UnsafeFullSingleton instance;

    private UnsafeFullSingleton(){

    }

    public static UnsafeFullSingleton getInstance(){
        if(instance == null){
            instance = new UnsafeFullSingleton();
        }
        return instance;
    }
    public void execute(){
        System.out.println("执行----------------->饱汉模式（线程不安全）");
    }
}
