package DSA.datastructres.linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static void generateBimarys1toN(int N){
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while (N-->0){
            String curr=q.poll();
            System.out.println(curr+" ");
            q.offer(curr+"0");// concateneates 0 and push to queue
            q.offer(curr+"1");// concateneates 1 and push to queue
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N=5;
        generateBimarys1toN(N);
        generateBimarys1toN(6);
    }
}
