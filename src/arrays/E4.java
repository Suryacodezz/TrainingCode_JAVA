package arrays;

public class E4 {
    public static void printArray(int[] arr) {
        for (int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static int[] createArray(){
        return new int[]{10,20,30};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
    int[] result=createArray();
    for (int num:result){
        System.out.println(num+" ");
    }
        System.out.println();

    //Anonymous array -> it dont have areference or object
        //after method call,we can never access it
        printArray(new int[]{10,20,30});
    }


}
