package DSA.datastructres.linear.linkedlist;
class LL{
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;//We don't know the address of the next node
            size++;//Increment the size as soon as a node si created
        }
    }
    public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("Null");
    }
    public void addFirst(String data){
        //Create the new node
        //⭐⭐⭐in the insert operation we should create the new node  and convert it as the head
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
    public void addLast(String data) {
        //Create the new node
        Node newNode = new Node(data);
        //empty list
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void removeFirst(){
        //empyt list -> cannot remove the head node
        if(head==null){
            System.out.println("list is empty.cant delete the head");
            return;
        }
        //for a single node,the head will point to the next(null)
        //for multiple nodes the head will point to the next(head.next)
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("list is empty.cant delete the tail");
            return;
        }
        //single element in the last
        if(head.next==null) {
            head = null; //c++ style of code
            size--;
            return;
        }
        // mutiple elements in the list
         Node curr=head;
        Node last=head.next;
        while (last!=null){
            curr=last;
            last=last.next;
        }
        // the last node will be clered by th JVM if not used
        //so we point the second mode to null pointer
        curr.next=null;
        size--;
    }
    public void removeTarget(String target){
        if(head==null){
            System.out.println("list is empty.cant delete the target");
            return;
        }
        //case: target is the head node itself
        if(head.data.equals(target)){
            head=head.next;
            size--;
            return;
        }
        // case: target is anywhere in the list
        Node prev=null;
        Node curr=head;
        while (curr!=null&& !curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        if (curr==null){
            System.out.println("target not found in list");
            return;
        }
        prev.next=curr.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll= new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("we");
        sll.printList();
        sll.addLast("in");
        sll.addLast("java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeTarget("Learning");
        sll.printList();
        sll.removeTarget("python");
    }
}