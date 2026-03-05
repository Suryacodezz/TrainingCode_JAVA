package DSA.datastructres.linear.stack;

public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size){
        capacity=size;
        arr=new int[size];
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        arr[++top]=x;
        System.out.println("added"+x+"to the top of stack");
    }
    int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }
    void display(){
        if (top==-1){
            System.out.println("stack underflow nothing to display");
            return;
        }
        for (int i=top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IntegerStack stack=new IntegerStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println("popped:"+stack.pop());
        stack.display();
    }

}
