package threads;

public class ATMTranscation extends Thread{
    public void run(){
        System.out.println("processing ATM Transcation");
    }
    public static void main(String[] args) {
        ATMTranscation t=new ATMTranscation();
        System.out.println("state of thread:"+t.getState());
        t.start();
        System.out.println("thread state after start"+t.getState());
    }
}/* initally the thread is in the new state.
     afterbcalling start(), it move to runnanle and executes the run() method
     the exact timng of the state change depends on the JVM scheduler

     - threade is created once
     -start () changees stae
     -thread cannot be restarted
     -final state is terminated or dead
     */