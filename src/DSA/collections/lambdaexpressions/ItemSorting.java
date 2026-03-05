package DSA.collections.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product("mobile ", 20000,1));
        products.add(new Product("camera",40000,2));
        products.add(new Product("laptop",50000,2));
        for (Product  p:products){
            System.out.println(p.name+", "+p.price+", "+p.quantity);
        }
        Collections.sort(products,(p1,p2) -> p2.quantity-p1.quantity);
        for (Product p:products){
            System.out.println(p.name+", "+p.price+", "+p.quantity);
        }


    }
}