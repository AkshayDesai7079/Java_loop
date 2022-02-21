package com.Thread;

class MyRunnable implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class RunnableI  {
    public static void main(String[] args) {
        MyRunnable1 runnable=new MyRunnable1();
        Thread t1=new Thread();
        Thread t=new Thread(runnable);
        t1.start();
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
