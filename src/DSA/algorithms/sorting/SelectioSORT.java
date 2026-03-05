package DSA.algorithms.sorting;

import java.util.Arrays;

public class SelectioSORT{
    public static void selection(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int minindex=i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if (minindex != i) {
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int [] arr={5,6,2,3,1,8};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
