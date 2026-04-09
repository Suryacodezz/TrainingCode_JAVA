package DSA.datastructres.nonlinear.Trees.heaps;

import java.util.PriorityQueue;

public class KLargestAndKthLargest {
   static void findKlargestAndKthLargestElements(int[] arr,int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        //1. insert all elements into the heap
        //2. remove the elements exceeding the k size
        for (int num:arr){
            minHeap.add(num);
            if (minHeap.size()>k){
                minHeap.poll();// remove smallest if size >k
            }
        }
        //print the kth largeest
        System.out.println("hte kth largest is:"+minHeap.peek());
        //print all the k-largest elements one by one
        while (!minHeap.isEmpty()){
            System.out.println(minHeap.poll()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={19,21,4,9,3,7};
        int k=3;
        findKlargestAndKthLargestElements(arr,k);
    }
}
