package DSA.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> users=new HashMap<>();
        users.put("admin","admin@123");
        users.put("user1","pass1");
        users.put("users2","pass2");
        users.put("admin","admin321");//updated password
        System.out.println("admin password:"+users.get("admin"));
    }
}
