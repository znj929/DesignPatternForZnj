package singleton;

/**
 * 饱汉模式（线程安全）
 * @Author: znj
 * @Date: 2021/5/10 0010 22:49
 */
public class SafeFullSingleton {

    private static SafeFullSingleton instance;

    private SafeFullSingleton(){

    }

    /**
     * double check 两遍的检查机制 （instance == null） 就是为了不会重复创建对象
     * @return
     */
    public static SafeFullSingleton getInstance(){
        if(instance == null){
            synchronized (SafeFullSingleton.class){
                if(instance == null){
                    instance = new SafeFullSingleton();
                }
            }
        }
        return instance;
    }
    public void execute(){
        System.out.println("执行----------------->饱汉模式（线程安全）");
    }
}
