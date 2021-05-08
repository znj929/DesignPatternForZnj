package factory.upgrade;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 22:29
 */
public class Product2Factory extends AbstractProductFactory {

    private static final Product2Factory instance = new Product2Factory();

    Product2Factory(){
    }

    public Product2Factory get(){
        return instance;
    }

    @Override
    protected Product spc() {
        return new ProductImpl2();
    }

}
