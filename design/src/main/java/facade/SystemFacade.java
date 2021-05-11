package facade;

/**
 * @Author: znj
 * @Date: 2021/5/11 0011 21:45
 */
public class SystemFacade {
    public void exucute(){
        ModelAService mA = new ModelAService();
        ModelBService mB = new ModelBService();
        mA.execute();
        mB.execute();
    }
}
