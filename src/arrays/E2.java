package arrays;

public class E2     {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=12;
        System.out.println(arr[1]);

        /* access amd update im array is fastest .this is because of index based access or direct index mapping
           so the time complexity is O(1)
           [idx=pos-1] or [pos =idx+1]
         */
        //  .length in array is not a method it is PROPERTY of array because no paranthesis()
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for (int x :arr){
            System.out.println(" ");
        }
        System.out.println();
        for (Object o:arr){
            System.out.println(o+" ");
        }
        System.out.println();
        String name="java";
        System.out.println(name.length()); // .length() is a method of string because it ha () in it
    }
}
/* array.length() is a peoperty
   string.length() is a method

MEMORY MANAGEMENT
- array object is stored in the heap
- variable reference is stored in the stack
- elements are stored in contiguous memory blocks like int[4][4][4] char[1][1][1]

 */