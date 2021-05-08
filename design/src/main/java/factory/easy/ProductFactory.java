package factory.easy;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:29
 */
public class ProductFactory {
    Product createProduct() {
        return new ProductImpl2();
    }

}
