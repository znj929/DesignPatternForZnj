package bridge桥接模式;

/**
 * @Author: znj
 * @Date: 2021/5/28 0028 23:00
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void execute();
}
