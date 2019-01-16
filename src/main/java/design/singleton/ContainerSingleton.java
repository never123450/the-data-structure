package design.singleton;


import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new HashMap<>();

    public ContainerSingleton() {
    }

    public static void putInstance(String key, Object instance){
        if (key!=null && key!="" && instance!=null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}