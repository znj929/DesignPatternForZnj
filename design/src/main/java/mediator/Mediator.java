package mediator;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 21:25
 */
public class Mediator {
    private ModelA modelA;
    private ModelB modelB;
    private ModelC modelC;

    public ModelA getModelA() {
        return modelA;
    }

    public void setModelA(ModelA modelA) {
        this.modelA = modelA;
    }

    public ModelB getModelB() {
        return modelB;
    }

    public void setModelB(ModelB modelB) {
        this.modelB = modelB;
    }

    public ModelC getModelC() {
        return modelC;
    }

    public void setModelC(ModelC modelC) {
        this.modelC = modelC;
    }

    public void executeModelAInvoke(){
        modelB.execute("模块B通知中介者");
        modelC.execute("模块C通知中介者");
    }

    public void executeModelBInvoke(){
        modelA.execute("模块A通知中介者");
        modelC.execute("模块C通知中介者");
    }

    public void executeModelCInvoke(){
        modelA.execute("模块A通知中介者");
        modelB.execute("模块B通知中介者");
    }


}
