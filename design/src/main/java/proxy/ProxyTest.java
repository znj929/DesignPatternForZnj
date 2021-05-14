package proxy;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 22:40
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();

    }
}
