package DSA.datastructres.linear.linkedlist.problems.floydsAlgo;



class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class CycleDetection {
    static Node head=null;
    static void createList() {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
    }
    static boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        createList();
        if(hasCycle()){
            System.out.println("cycle detected");
        }else{
            System.out.println("no cycle");
        }
    }
}
