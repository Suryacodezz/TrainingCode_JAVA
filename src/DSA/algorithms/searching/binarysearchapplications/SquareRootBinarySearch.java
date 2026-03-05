package DSA.algorithms.searching.binarysearchapplications;

public class SquareRootBinarySearch {
    public static int sqrtbs(int n){
        int s=0;
        int e=n;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            }else if(square>n){
                e=mid-1; // go to the left hand side
            }else{
                //store te probabale anser and mmove to the right
                ans=mid; // th mid value is stored in the answer
                s=mid+1;//we have to move to right to find accruate answer
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrtbs(36));
        System.out.println(sqrtbs(37));
    }
}
