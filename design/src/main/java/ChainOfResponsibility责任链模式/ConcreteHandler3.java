package ChainOfResponsibility责任链模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 23:55
 */
public class ConcreteHandler3 extends Handler{
    public ConcreteHandler3(Handler handler) {
        super(handler);
    }

    @Override
    public void execute() {
        System.out.println("流程3");
        if(handler != null){
            handler.execute();
        }
    }
}
