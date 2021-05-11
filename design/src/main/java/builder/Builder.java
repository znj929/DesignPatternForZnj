package builder;

/**
 * @Author: znj
 * @Date: 2021/5/11 0011 22:04
 */
public interface Builder {
    Builder setFirst(String value);
    Builder setSecond(String value);
    Product create();
}
