package factory.upgrade;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:38
 */
public class FactoryTest {
    public static void main(String[] args) {
        Product p1 = new Product1Factory().get().createProduct();
        p1.operation();
        Product p2 = new Product2Factory().get().createProduct();
        p2.operation();
    }
}
