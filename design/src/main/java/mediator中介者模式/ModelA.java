package mediator中介者模式;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 21:23
 */
public class ModelA {

    private Mediator mediator;

    public ModelA(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelA(this);
    }

    public void executeModel() {
        mediator.executeModelAInvoke();
    }
    public void execute(String invoke){
        System.out.println("调用模块A");
    }
}
