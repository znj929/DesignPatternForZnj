package observer观察者模式;


import java.util.Observable;

/**
 * @Author: znj
 * @Date: 2021/5/23 0023 11:05
 */
public class Subject extends Observable {
    private Integer state;

    public Subject (Integer state){
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        //当状态被改变，通知观察者
        this.setChanged();
        this.notifyObservers(state);
    }


}
