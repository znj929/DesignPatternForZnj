package template;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 21:39
 */
public abstract class AbstractDiscountCalculatorl implements DiscountCalculator{
    @Override
    public void calculate(){
        System.out.println("先使用 通用优惠。");
        spec();
    }
    abstract void spec();
}
