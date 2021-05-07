package factory;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:38
 */
public class FactoryTest {
    public static void main(String[] args) {
        ProductFactory pf = new ProductFactory();
        Product product = pf.createProduct();
        product.operation();
    }
}
