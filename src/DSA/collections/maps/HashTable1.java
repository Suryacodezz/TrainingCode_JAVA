package DSA.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

        public static void main(String[] args) {
            Hashtable<Integer,String> ht=new Hashtable<>();
            ht.put(106,"sham");
            ht.put(117,"ram");
            ht.put(128,"sam");
            ht.put(100,"siri");
            ht.put(99,"raj");
            System.out.println(ht.getOrDefault(100,"not found"));
            System.out.println(ht.getOrDefault(99,"not found"));
            ht.putIfAbsent(118,"ravi");//this will be added
            System.out.println("updated table:"+ht);
            ht.putIfAbsent(99,"sunil");//this wont be added
            System.out.println("{updated table"+ht);

        }
    }

