package factory.complex;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:38
 */
public class FactoryTest {
    public static void main(String[] args) {
        //int i = 0;
        //System.out.println(test(i));
        //System.out.println(i++);

        ProductA p1 =  Factory2Impl.get().createProductA();
        p1.operation();
        ProductB p2 = Factory1Impl.get().createProductB();
        p2.operation();
    }

    /*public static int test(int i){
        i++;
        return i;
    }*/
}
