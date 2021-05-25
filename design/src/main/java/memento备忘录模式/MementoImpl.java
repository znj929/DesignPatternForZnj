package memento备忘录模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:25
 */
public class MementoImpl implements Memento {
    private String state;

    public MementoImpl(String state) {
        System.out.println("->" + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
