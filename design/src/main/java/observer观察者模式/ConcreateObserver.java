package observer观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @Author: znj
 * @Date: 2021/5/23 0023 22:31
 */
public class ConcreateObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //Integer state = (Integer) arg;
        Subject subject = (Subject) o;
        Integer state = subject.getState();
        System.out.println("目标对象发生改变-》"+state);
    }
}
