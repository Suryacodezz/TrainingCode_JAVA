package threads;

import com.sun.source.tree.SynchronizedTree;

import java.io.IOException;

public class SafeBankAccount {
    int balance = 1000;
   synchronized  void withdraw(int amount)  {   // synchronization is used
        balance-=amount;
        }
        public static void main(String[] args) throws InterruptedException {
            SafeBankAccount b=new SafeBankAccount();
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
     the synchronization keyword ensures that only one thread can execute withdraw() operation at a time,preventing RACE CONDITION and esuring
     correct balance deduction

     - synchronization avoid RACE CONDITION
     - looks critical section in an application
     - slower but safe
     - essential for shared resources
     */
