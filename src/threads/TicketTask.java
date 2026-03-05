package threads;

import javax.xml.namespace.QName;

public class TicketTask implements Runnable{
    String task;
    TicketTask(String task){
       this.task=task;
    }
    public void run(){
        System.out.println(task+"in progress");
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new TicketTask("seat assignment")) ;
        Thread t2=new Thread(new TicketTask("payment processing"));
        Thread t3=new Thread(new TicketTask("sms notification"));
        t1.start();
        t2.start();
        t3.start();
    }

}
/*
        each runnable object is a job,and the thread class is responsible only for execution ,which makes this approach cleaner and more flexible.
        - implements runnable
        - better design
        - interviewers mostly ask this
        - supports multiple inheritance vio interfaces
 */
