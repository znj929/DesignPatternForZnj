package state状态模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 22:06
 */
public class Context {
    private State state;

    public Context(State state){
        this.state = state;
        this.state.execute();
    }

    public void execute(int stateType){
        if(stateType == 1){
            this.state = new NewOrderState();
            this.state.execute();
        }else if(stateType == 2){
            this.state = new ApprovingOrderState();
            this.state.execute();
        }else if(stateType == 3){
            this.state = new ApprovedOrderState();
            this.state.execute();
        }
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
