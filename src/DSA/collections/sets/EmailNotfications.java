package DSA.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class EmailNotfications {
    public static void main(String[] args) {
        Set<String> emailQueue=new HashSet<>();
        emailQueue.add("a@gmail,com");
        emailQueue.add("b@gmail,com");
        emailQueue.add("d@gmail,com");
        emailQueue.add("e@gmail,com");
        emailQueue.add("a@gmail,com");
        emailQueue.add("b@gmail,com");
        System.out.println("emials to send:"+emailQueue);
        System.out.println("size:"+emailQueue.size());

    }
}
