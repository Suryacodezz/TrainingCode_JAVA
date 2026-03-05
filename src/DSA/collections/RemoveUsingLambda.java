package DSA.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(42);
        list.add(12);
        list.add(111);
        list.add(22);
        list.add(9);
        System.out.println("before:"+list);
        list.removeIf(n -> n%2==0);
        System.out.println("after:"+list);

    }
}
