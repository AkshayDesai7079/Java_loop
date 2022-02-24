package com.Lambda;
/*
class MyRunnable implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("child Thread-1");
        }
    }
}

 */

public class ThreadLambda {
    public static void main(String[] args) {
       Runnable r=()->{
           for (int i=0;i<5;i++){
               System.out.println("child thread");
           }
       };

        Thread thread=new Thread(r);
        thread.start();

        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
