package memento备忘录模式;

/**
 * 备忘录管理器
 * @Author: znj
 * @Date: 2021/5/25 0025 22:30
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
