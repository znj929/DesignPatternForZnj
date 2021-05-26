package flyweight享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: znj
 * @Date: 2021/5/26 0026 23:27
 */
public class FlyweightFactory {
    private Map<String,Flyweight> map = new HashMap<>();
    Flyweight get(String key){
        Flyweight flyweight = map.get(key);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight();
            map.put(key,flyweight);
        }
        return flyweight;
    }
}
