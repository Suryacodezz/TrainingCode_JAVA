package DSA.collections.bitMnaipulation;

public class CheckBit {
    public static void main(String[] args) {
        int n=10;
        int k=1;
        if((n&(1<<k))!=0){
            System.out.println("bit is set");
        }else{
            System.out.println("bit is not set");
        }
    }
}
