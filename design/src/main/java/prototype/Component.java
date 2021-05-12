package prototype;

/**
 * @Author: znj
 * @Date: 2021/5/12 0012 23:30
 */
public class Component {
    private String name;

    Component(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Component(getName());
    }
}
