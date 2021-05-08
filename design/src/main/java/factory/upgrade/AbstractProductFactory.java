package factory.upgrade;

/**
 * @Author: znj
 * @Date: 2021/5/8 0008 21:35
 */
public abstract class AbstractProductFactory {

    Product createProduct(){
        commonCreate();
        return spc();
    }

    private void commonCreate(){
        System.out.println("通用生产");
    }

    protected abstract Product spc();
}
