package factory.complex;

/**
 * ProductA1 和 ProductB1 组合
 * @Author: znj
 * @Date: 2021/5/9 0009 18:01
 */
public class Factory1Impl implements Factory {

    private static final Factory1Impl instance = new Factory1Impl();

    private Factory1Impl(){

    }
    public static Factory get(){
        return instance;
    }

    @Override
    public ProductA createProductA() {
        return new ProductAImpl1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBImpl1();
    }
}
