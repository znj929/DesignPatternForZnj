package strategy策略模式;

/**
 * @Author: znj
 * @Date: 2021/5/25 0025 20:27
 */
public class DiscountCalculateStrategyFactory {
    DiscountCalculate getDiscountCalculateStrategy(int discountStyle){
        if(discountStyle == 1){
            return new DiscountCalculateStrategyA();
        }else if(discountStyle == 2){
            return new DiscountCalculateStrategyB();
        }
        return new DiscountCalculateStrategyDefault();
    }
}
