package memento备忘录模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:20
 */
public class Originator {
    private String state;

    public void prepare(){
        this.state = "第一次初始化数据";
    }

    public void executeA(){
        System.out.println("基于："+state+",执行A方法");
        state +=",执行A方法后的结果";
    }

    public void executeB(){
        System.out.println("基于："+state+",执行B方法");
        state +=",执行B方法后的结果";
    }

    public Memento createMemento(){
        return new MementoImpl(this.state);
    }

    public void setMemento(Memento memento){
        MementoImpl mementoImpl = (MementoImpl)memento;
        this.state = mementoImpl.getState();
    }

}
