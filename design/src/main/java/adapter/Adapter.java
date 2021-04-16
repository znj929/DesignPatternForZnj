package adapter;

/**
 * @Author: znj
 * @Date: 2021/4/16 0016 22:09
 */
public class Adapter implements TargetService {

    private Adaptee adaptee;

    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public String getT() {
        return "苹果";
    }

    public void request(){
        System.out.println(adaptee.getNewT());
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
