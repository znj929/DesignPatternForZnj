package strategy策略模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 20:26
 */
public class DiscountCalculateStrategyDefault implements  DiscountCalculate{
    @Override
    public void calculate() {
        System.out.println("执行默认的折扣优惠活动");
    }
}
