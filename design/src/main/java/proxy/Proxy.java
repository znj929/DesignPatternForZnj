package proxy;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 22:35
 */
public class Proxy implements Subject{

    private Subject subject;

    Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("调用前，可以做一些数据准备，条件判断 等");
        subject.request();
        System.out.println("调用后");
    }
}
