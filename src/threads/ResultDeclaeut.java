package threads;

public class ResultDeclaeut {
    synchronized void declareResult() throws Exception{
        System.out.println("watinig for response");
        wait();
        System.out.println("result declared");
    }
    synchronized void approve(){
        notify();
    }

public static void main(String[] args)throws Exception {
    ResultDeclaeut r1 =new ResultDeclaeut();
    new Thread(() ->{
                try{
                    r1.declareResult();
                }catch( Exception e){}
    }).start();
    Thread.sleep(2000);
    new Thread(() ->
            r1.approve()).start();

    }
}
/*
    the declareResult() method waits until another thrread calls notify().
    during wait() the thread releases the lock,allowing oter thrreads to enter synchronized code

    sleep() -> time based
    wait() -> condition based
    wait() -> releases lock ->by the notify method
    wait() is used in inter threaded communication
 */
