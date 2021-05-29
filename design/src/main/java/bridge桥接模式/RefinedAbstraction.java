package bridge桥接模式;

/**
 * @Author: znj
 * @Date: 2021/5/29 0029 21:48
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void execute() {
        implementor.execute();
    }
}
