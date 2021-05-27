package Compoent装饰器模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 22:57
 */
public class ConcreateCompoent implements Compoent {
    @Override
    public void execute() {
        System.out.println("实现基础功能");
    }
}
