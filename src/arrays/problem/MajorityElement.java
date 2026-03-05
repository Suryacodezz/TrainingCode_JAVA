package arrays.problem;

public class MajorityElement {
    public static void main(String[] args) {
        int candidate=0;
        int count=0;
        int arr[]={2,2,1,1,2,2,2};
        for(int i=0;i<=5;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.print("Majority elements:"+candidate);
    }
}
