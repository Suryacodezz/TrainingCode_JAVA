package DSA.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("laptop");
        cart.add("mouse");
        cart.add("keyboard");
        cart.remove("mouse");
        cart.set(1, " mech keyboard");
        System.out.println("cart items:"+cart);
        System.out.println("total items:"+cart.size());
    }
}
