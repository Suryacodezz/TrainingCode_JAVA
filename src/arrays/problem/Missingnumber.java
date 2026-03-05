package arrays.problem;

public class Missingnumber {
    public static int missingnumber(int[] arr){
        int n=arr.length+1;
        int totalSum=(n+(n+1))/2;
        int arraySum=0;
        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(missingnumber(arr));
    }
}
