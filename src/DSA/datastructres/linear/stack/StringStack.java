package DSA.datastructres.linear.stack;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr=new String[MAX_SIZE];
    private int top=-1;// stack is initally empty
    public boolean isEmoty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String data){
        if (isFull()){
            System.out.println("stack overflow  cannot add more elements");
            return;
        }
        arr[++top]=data;
        System.out.println("the string"+data+"was pushed to stack");
    }
    public String pop(){
        if (isEmoty()){
            System.out.println("stack underflow cannot remove element");
            return null;
        }
        String popped=arr[top--];
        return popped;
    }
    public void display(){
        if (isEmoty()){
            System.out.println("stack underflow no elements to display");
            return;
        }
        System.out.println("the elements in order [LIFO] are:");
        for (int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return top+1;
    }
    public String peek(){
        //intention is to fetch the top element
        if (isEmoty()){
            System.out.println("stack underflow cannot retrieve top");
            return null;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        StringStack stack=new StringStack();
        stack.pop();
        stack.push("vk");
        stack.push("abd");
        stack.push("rs");
        stack.display();
        System.out.println("top element:"+stack.peek());
        String popped= stack.pop();
        System.out.println("popped element:"+popped);
        stack.display();
        System.out.println("stack size:"+stack.size());
    }
}
