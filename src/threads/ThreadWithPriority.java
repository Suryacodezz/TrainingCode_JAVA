package threads;

public class ThreadWithPriority extends Thread{
    public void run(){
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName() + "| prioprity" + Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadWithPriority t1=new ThreadWithPriority();
        ThreadWithPriority t2=new ThreadWithPriority();
        ThreadWithPriority t3=new ThreadWithPriority();
        t1.setName("low prioroty thread");
        t2.setName("medium prioroty thread");
        t3.setName("high prioroty thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        //t3.setPriority(11);  this gives IllegalArgumentException
        t1.start();
        t2.start();
        t3.start();

    }
}
/*
  - thread priority is only a suggestion to the JVM on the scheduler
  - higher priority doesnt guarantee execution order
  - higher priority threads may get more CPU scheduler time
  - the actual behaviour depends on te JVM and operating system
 */