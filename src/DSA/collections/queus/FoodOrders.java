package DSA.collections.queus;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        // for adding-add()[fail][strict]  , offer() [not fail][not strict]
        orders.add("Order101");//strict capacity based
        orders.offer("Order102");//flexible
        System.out.println("Orders:"+orders);
        System.out.println("serving:"+orders.poll());
        System.out.println("pending order:"+orders);
    }
}
