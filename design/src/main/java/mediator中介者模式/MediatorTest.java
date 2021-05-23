package mediator中介者模式;

/**
 * @Author: znj
 * @Date: 2021/5/13 0013 21:34
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        ModelA modelA = new ModelA(mediator);
        modelA.executeModel();
    }
}
