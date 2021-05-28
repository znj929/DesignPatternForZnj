package ChainOfResponsibility责任链模式;

/**
 * @Author: znj
 * @Date: 2021/5/27 0027 23:50
 */
public abstract class Handler {
    public Handler handler;

    public Handler(Handler handler){
        this.handler = handler;
    }

    public abstract void execute();
}
