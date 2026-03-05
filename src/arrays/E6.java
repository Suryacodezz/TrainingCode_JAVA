package arrays;

public class E6 {
    public static void display(int...arr) { // varargs(...) -> it internally uses arrays
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);
    }
}
