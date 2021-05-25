package strategy策略模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 20:40
 */
public class Context {

    private DiscountCalculate strategy;

    public DiscountCalculate getStrategy() {
        return strategy;
    }

    public void setStrategy(DiscountCalculate strategy) {
        this.strategy = strategy;
    }

    public void calculate() {
        strategy.calculate();
    }
}
