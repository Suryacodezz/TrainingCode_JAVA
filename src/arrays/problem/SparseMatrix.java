package arrays.problem;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {0,0,3},
                {0,0,0},
                {4,5,0}
        };
        int rows=matrix.length;
        int clos=matrix[0].length;
        int zeroCOUNT=0;
        int nonZero=0;
        for(int i=0;i<rows;i++){
            for (int j=0;j<clos;j++){
                if(matrix[i][j]==0){
                    zeroCOUNT++;
                }else {
                    nonZero++;
                }
            }
        }
        System.out.println("zeros:"+zeroCOUNT);
        System.out.println("non zeros:"+nonZero);
        System.out.println(zeroCOUNT>nonZero ? "sparse" : "not sparse");
    }
}
