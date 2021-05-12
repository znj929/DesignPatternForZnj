package prototype;

/**
 * @Author: znj
 * @Date: 2021/5/12 0012 23:32
 */
public class test {
    public static void main(String[] args) {
        Product product = new Product("1", "2", new Component("3"));
        Product copyProduct = new Product(product.getField1(), product.getField2(), product.getComponent());
        System.out.println(copyProduct.toString());
    }
}
