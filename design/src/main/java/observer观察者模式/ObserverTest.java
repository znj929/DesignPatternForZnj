package observer观察者模式;

import java.util.Observer;

/**
 * @Author: znj
 * @Date: 2021/5/23 0023 22:34
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sb = new Subject(0);
        Observer ob = new ConcreateObserver();
        sb.addObserver(ob);
        sb.setState(1);
        sb.setState(2);
    }
}
