package strategy策略模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 20:16
 */
public class StrategyTest {
    public static void main(String[] args) {
        DiscountCalculate discountCalculate = new DiscountCalculateStrategyFactory().getDiscountCalculateStrategy(0);

        Context context = new Context();
        context.setStrategy(discountCalculate);
        context.calculate();
    }
}
