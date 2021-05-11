package builder;

/**
 * @Author: znj
 * @Date: 2021/5/11 0011 22:12
 */
public class ConcreateBuilder implements Builder{

    private Product instence = new Product();

    @Override
    public Builder setFirst(String value) {
        System.out.println("执行第一步特殊逻辑");
        instence.setField1(value);
        return this;
    }

    @Override
    public Builder setSecond(String value) {
        System.out.println("执行第二步特殊逻辑");
        instence.setField2(value);
        return this;
    }

    @Override
    public Product create() {
        return instence;
    }
}
