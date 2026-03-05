package threads;

public class DeadLock {
    static final Object accA=new Object();
    static final Object accB=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            synchronized (accA){
                System.out.println("thread 1 locked account A");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accB){
                    System.out.println("thread 2 locked account B");
                }
            }
        });
        Thread t2=new Thread(() -> {
            synchronized (accB){
                System.out.println("thread 2 locked account A");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accA){
                    System.out.println("thread 1 locked account B");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

/*
  # Thread-1 acquires a lock on account A and then sleeps giving thead-2 to acquire lock on account B.
   # Now thread-1 waits for account A and thread-2 waits for account B.since neither thread releasees the lock .
     both keep waiting and thus creating a DEADLOCK

   DEADLOCK - DEADLOCK oocurs when each thread is holding a resources and waiting for the other to release it.
 */