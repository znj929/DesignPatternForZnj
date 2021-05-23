package mediator中介者模式;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 21:23
 */
public class ModelC {

    private Mediator mediator;

    public ModelC(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelC(this);
    }

    public void executeModel() {
        mediator.executeModelCInvoke();
    }

    public void execute(String invoke){
        System.out.println("调用模块C");
    }
}
