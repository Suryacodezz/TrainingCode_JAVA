package DSA.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionIndex(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }

        // place the pivot at the correct position on index
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        //
        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr,int s,int e){
        //base cas//if single elements or out of bounds
        if (s >= e) {
            return;
        }
        //find the pivot for the partition of the arrya
        int p=partitionIndex(arr,s,e);
        //now we use recrssion to sort the LHS & RHS
        //left part
        quickSort(arr,s,p-1);
        //right part
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args) {
        int[] arr={8,4,7,5,10,2,6};
        int n=arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}