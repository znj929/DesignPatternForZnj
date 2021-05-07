package template;

/**
 * @Author: znj
 * @Date: 2021/5/7 0007 21:18
 */
public class TemplateMethodTest {
    public static void main(String[] args) {

        DiscountCalculator d1 = new DiscountCalculatorl1();
        d1.calculate();

        DiscountCalculator d2 = new DiscountCalculatorl2();
        d2.calculate();

        DiscountCalculator d3 = new DiscountCalculatorl3();
        d3.calculate();

    }
}










