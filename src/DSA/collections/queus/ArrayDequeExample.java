package DSA.collections.queus;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("user type a");
        actions.addLast("user type b");
        actions.addLast("user deletes a");
        System.out.println("remaning actions:"+actions);
        System.out.println("undo:"+actions.removeLast());
        System.out.println("remaning actions:"+actions);

    }
}
