package DSA.datastructres.nonlinear.Trees.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("the patient that gets operated first is patient: "+severity.poll());
        System.out.println("patient is queue: "+severity );
    }
}
