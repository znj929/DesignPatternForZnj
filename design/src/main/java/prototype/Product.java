package prototype;

/**
 *
 * @author znj
 */
public class Product {
    private String field1;
    private String field2;

    private Component component;

    Product(String field1,String field2,Component component){
        this.field1 = field1;
        this.field2 = field2;
        this.component = component;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "Product{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", component=" + component +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return new Product(getField1(),getField2(),getComponent());//浅拷贝
        //深拷贝，递归对自己引用的对象也进行拷贝
        return new Product(getField1(),getField2(), (Component) getComponent().clone());
    }
}
