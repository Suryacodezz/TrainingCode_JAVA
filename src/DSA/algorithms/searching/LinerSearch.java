package DSA.algorithms.searching;

public class LinerSearch {
    static int linear(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;//-1 if not found
    }
    public static void main(String[] args) {
        int[] arr={10,52,0,8,1,3};
        System.out.println(linear(arr,8));


    }
}
