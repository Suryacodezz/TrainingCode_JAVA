package threads;

public class JoinProof {
    static class Task extends Thread{
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("task finished");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Task t1=new Task();
        t1.start();// the main thread doestn wait for this thread
        t1.join();// code will wait (gauranteed)
        System.out.println("main tread resumes");

    }
}
//try to remove join and run the difference is noticed