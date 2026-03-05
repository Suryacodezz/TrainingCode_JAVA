package DSA.collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(42);
        list.add(12);
        list.add(111);
        list.add(22);
        list.add(9);
        System.out.println(list);
        Iterator<Integer> it= list.iterator();
        //remove the elements wich are greater than 10
        while (it.hasNext()){
            Integer i=it.next();
            if (i>10){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
