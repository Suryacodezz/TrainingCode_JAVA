package arrays;

public class E3 {
    public static void main(String[] args) {
        //types
        int[] arr={1,2,3,4,5};

        //2D array -> array of arrays ->matrix
        int[][] matrix={{1,2,3}, //row 0     number of rows is the length of array
                        {4,5,6}, //row 1
                       {7,8,9}}; //row 2   [3X3] matrix (square matrix)
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println();

        //jagged array- in 2D array if the row length is not same (jagged means irregular)

        int[][] jagged={
                {1,2,3,4,5},
                {1,2},
                {1}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        System.out.println();
        // array.length=rows
        // array[rows].length =columns
       for(int[] a : jagged){
           for (int x : a){
               System.out.println(x+" ");
            }
            System.out.println();
        }
       char[][] names ={{'s','u','n'},
                {'m','o','n'},
              {'t','u','e'} };
       for (char[] c: names){
           for (char x : c){
               System.out.println(x);
           }
       }
    }
}
