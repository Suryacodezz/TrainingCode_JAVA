package DSA.collections.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Exmaple5 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println("inital list:"+list);
        Collections.sort(list,(a,b) -> a-b);//ascending
        System.out.println("sorted list:"+list);
        Collections.sort(list,(a,b) -> b-a);//descending
        System.out.println("sorted list:"+list);
    }
}
