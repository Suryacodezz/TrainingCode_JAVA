package DSA.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,String> hashmap=new HashMap<>();
        // THE VALUES CAN BE DUPLICTAE BUT KEYS CANNOT BE DUPLICATE
        hashmap.put("01","aaaa");
        hashmap.put("03","bbbb");
        hashmap.put("04","zzzz");
        hashmap.put("02","xxxx");
        for (Map.Entry<String,String> entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
        Map<String,String> hashmap1=new HashMap<>();
        // THE VALUES CAN BE DUPLICTAE BUT KEYS CANNOT BE DUPLICATE
        hashmap.put("01","aaaa");
        hashmap.put("03","bbbb");
        hashmap.put("04","zzzz");
        hashmap.put("02","xxxx");
        for (Map.Entry<String,String> entry: hashmap1.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }
}
