package mediator中介者模式;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 21:23
 */
public class ModelB {

    private Mediator mediator;

    public ModelB(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModelB(this);
    }

    public void executeModel(){
        mediator.executeModelBInvoke();
    }
    public void execute(String invoke){
        System.out.println("调用模块B");
    }
}
