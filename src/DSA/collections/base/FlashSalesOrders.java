package DSA.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSalesOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIDs=new ArrayList<>();
        orderIDs.add(1);
        orderIDs.add(2);
        orderIDs.add(3);
        System.out.println("orders received:"+orderIDs);
        System.out.println("no of orders:"+orderIDs.size());
    }
}
