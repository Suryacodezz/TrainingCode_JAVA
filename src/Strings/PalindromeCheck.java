package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String original="madam";
       boolean ispali=true;
       int left=0;
       int right=original.length()-1;
       while (left<right){
           if(original.charAt(left)!=original.charAt(right)){
               ispali=false;
               break;
           }
           left++;
           right--;
       }
       if (ispali){
           System.out.println("palindrome");
       }else {
           System.out.println("not palindrome");
       }
    }
}
