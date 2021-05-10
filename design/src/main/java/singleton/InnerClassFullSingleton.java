package singleton;

/**
 * 饱汉模式（内部类保证 线程安全）
 * @Author: znj
 * @Date: 2021/5/10 0010 22:49
 */
public class InnerClassFullSingleton {

    private InnerClassFullSingleton(){

    }

    public static class InnerHolder{
        private static InnerClassFullSingleton instance = new InnerClassFullSingleton();

    }

    /**
     * 利用 java 类静态初始化只会执行一次 来保证一定不会被创建两次对象来保证线程安全
     * @return
     */
    public static InnerClassFullSingleton getInstance(){
        return InnerHolder.instance;
    }
    public void execute(){
        System.out.println("执行----------------->饱汉模式（内部类保证 线程安全）");
    }
}
