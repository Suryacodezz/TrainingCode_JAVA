package arrays;

public class E1 {
    public static void main(String[] args) {
        //METHOD-1

        int[] arr;//declaration
        arr=new int[5];//memory allocation[20 bytes]

        //METHOD-2

        //if we dont provide the value JVM uses "fallback mechnism" i.e it uses default value of that data type
        int[] arr2=new int[5]; //declaration and memory allocation in single line
        System.out.println(arr[4]);
        System.out.println(arr[3]);

        //METHOD-3

        int[] arr3={1,2,3,4,5};

        //METHOD-4
        int[] arr4=new int[]{1,2,3,4,5};
    }
}
