package builder;

/**
 * @Author: znj
 * @Date: 2021/5/11 0011 22:17
 */
public class BuilderTest {
    public static void main(String[] args) {
        Product p = new ConcreateBuilder()
                .setFirst("1")
                .setSecond("2")
                .create();
        System.out.println(p.toString());
    }
}
