package factory.complex;

/**
 * ProductA2 和 ProductB2 组合
 * @Author: znj
 * @Date: 2021/5/9 0009 18:01
 */
public class Factory2Impl implements Factory {


    private static final Factory2Impl instance = new Factory2Impl();

    private Factory2Impl(){

    }
    public static Factory get(){
        return instance;
    }

    @Override
    public ProductA createProductA() {
        return new ProductAImpl2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBImpl2();
    }
}
