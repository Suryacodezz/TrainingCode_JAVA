package DSA.datastructres.linear.queues;

public class IntegerQueue {
    private static final int MAXSIZE=5;
    private int[] arr=new int[MAXSIZE];
    private int front;
    private int rear;
    public IntegerQueue(){
        front=rear=-1; // the queue is empty initally
    }
    private boolean isEmpty(){
        return (front==1&&rear==1);
    }
    public boolean isFull(){
        return rear==MAXSIZE-1;
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("queue is full cannot add more element");
            return;
        }
        if (isEmpty()){
            front=rear=0;
        }else{
            rear++;
        }
        arr[rear]=data;
        System.out.println("enqueue:"+ data+"into the queue");
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("deque is empty cannot remove data");
            return;
        } else if (front==rear) {
            front=rear=-1;
        }else {
            front++;
        }
    }
    public int getFront(){
        if (isEmpty()){
            System.out.println("queue is empty cant get front");
            return -1;
        }
        return arr[front];
    }
    public int getRear(){
        if (isEmpty()){
            System.out.println("queue is empty cant get rear");
            return -1;
        }
        return arr[rear];
    }
    public int getSize(){
        if (isEmpty()) return 0;
        return rear-front+1;
    }
    public void dispaly(){
        if (isEmpty()){
            System.out.println("queue is empty cant dispaly elements" );
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.println(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        IntegerQueue queue=new IntegerQueue();
        int[] arr={1,2,3,4,5,6,7,8};
        for (int x:arr){
            queue.enqueue(x);
        }
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
    }
}
