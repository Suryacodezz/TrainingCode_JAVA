package DSA.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveorders=new ArrayList<>();
        //new orders added
        liveorders.add("ORD101");
        liveorders.add("ORD102");
        liveorders.add("ORD103");
        // check
        //
        System.out.println("ORD103 exists?"+liveorders.contains("ORD103"));
        //check the live orders
        System.out.println("live orders:"+liveorders);
        liveorders.clear();
        System.out.println("orders after closing:"+liveorders);
    }
}
