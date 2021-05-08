package factory.upgrade;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:29
 */
public class Product1Factory extends AbstractProductFactory {

    private static final Product1Factory instance = new Product1Factory();

    Product1Factory(){
    }

    public Product1Factory get(){
        return instance;
    }

    @Override
    protected Product spc() {
        return new ProductImpl1();
    }



}
