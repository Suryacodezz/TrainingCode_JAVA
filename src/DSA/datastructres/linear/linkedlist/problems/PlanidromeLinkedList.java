package DSA.datastructres.linear.linkedlist.problems;

import java.util.List;
import java.util.Stack;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

public class PlanidromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=stack.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(1);
        System.out.println(isPalindrome(head1)? "palindrome":"not palindrome");
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(2);
        head2.next.next=new ListNode(3);
        System.out.println(isPalindrome(head2)? "palindrome":"not palindrome");
    }
}
