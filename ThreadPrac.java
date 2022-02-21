package com.Thread;

import static com.Thread.ThreadColor.*;

class AnotherThread extends Thread{
    public void run(){
        System.out.println(A_BLUE+"Hello from another therad");
    }
}

public class ThreadPrac  {


    public static void main(String[] args) throws InterruptedException{
        System.out.println(A_BLUE+"Hello from another therad");

        AnotherThread thread=new AnotherThread();
        thread.start();

        new Thread(){
            public void run(){
                System.out.println(A_GREEN+"Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnable1=new Thread(new MyRunnable1()){
            public void run(){
                System.out.println(A_RED+"hello from anonymous class's implementation of run()");
                try {
                    thread.join();
                    System.out.println(A_RED+"another terminated timed out so i am running again");
                    System.out.println();
                } catch (InterruptedException e) {
                    System.out.println(A_RED+"i couldn't wait after all . i was interrupted");
                }
            }
        };
        myRunnable1.start();

        System.out.println(A_PURPLE+"hello again from the main thread");
    }
}
