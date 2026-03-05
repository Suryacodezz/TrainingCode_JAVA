package threads;

public class BankAccount extends Thread  {
    int balance = 1000;
    void withdraw(int amount){
        balance-=amount;
        }
        public static void main(String[] args) throws InterruptedException {
            BankAccount b=new BankAccount();
            Thread t1=new Thread(()-> b.withdraw(500));
            Thread t2=new Thread(() -> b.withdraw(500));
            t2.start();
            t1.start();
            t1.join();
            t2.join();
            //join will make sure that main thread waits for the child threads to complete
            System.out.println("FINAL BALANCE:"+b.balance);
        }
    }
    /*
    both the threads  t1 and ts access and modify the same balance variable simultaneously
    due to lack of synchronization the final balance the final balance becomes inconsistent

    - shared data causes issues
    - execution order is unpredictable
    - lead to data inconsistency
    - need synchronization to solve the race condition
     */