package threads;

public class FestRegt {
    static class FormFillinfg extends Thread{
    public void run(){
        System.out.println("form filling started");
    }
    }
    static class DocUpload extends Thread{
        public void run(){
            System.out.println("document uploaded");
        }
    }
    static class MailNotification extends Thread{
        public void run(){
            System.out.println("confirmation mail sent");
        }
    }
    public static void main(String[] args) {
        FormFillinfg ff= new FormFillinfg();
        DocUpload d=new DocUpload();
        MailNotification m=new MailNotification();
        ff.run();
        d.run();
        m.run();
    }
    /*
    - java ptgm starts with one main thread
    - threads allow parralel exectuin -. concurrency
    - output order is not gauranteed
    - threads share the same memory
    - it imporves theperformance and responsiveness

    when start() is called the JVM creates a new thread
    when run() is called directly, there is no concurrency
     */
}
