package DSA.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashhTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"sham");
        ht.put(117,"ram");
        ht.put(128,"sam");
        ht.put(100,"siri");
        ht.put(99,"raj");
        //ht.put(null,"rahul"); no null keys allowed in hashtable
        ht.put(111,"null");//null values can be added1e
        for (Map.Entry<Integer,String> entry: ht.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

    }
}
