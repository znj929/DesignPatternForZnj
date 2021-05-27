package Compoent装饰器模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 22:58
 */
public class Decorator implements Compoent{
    private Compoent compoent;

    public Decorator(Compoent compoent){
        this.compoent = compoent;
    }

    @Override
    public void execute() {
        System.out.println("----实现基础功能前加强功能");
        compoent.execute();
        System.out.println("----实现基础功能后加强功能");
    }
}
