package memento备忘录模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:17
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator =new Originator();
        //初始化数据
        originator.prepare();
        //把初始化数据保存备忘录
        Memento memento = originator.createMemento();

        //创建一个备忘录管理器
        Caretaker caretaker = new Caretaker();
        //把备忘录 保存到备忘录管理器中。
        caretaker.saveMemento(memento);

        //操作 第一次更新初始化数据
        originator.executeA();

        memento = caretaker.getMemento();
        originator.setMemento(memento);
        originator.executeB();

    }
}
