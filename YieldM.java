package com.Thread;
class MyThread5 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            Thread.yield();
            System.out.println("child thread");
        }
    }
}


public class YieldM {
    public static void main(String[] args) {
        MyThread5 myThread5=new MyThread5();
        myThread5.start();

        for (int i=0;i<5;i++){
            System.out.println("this is main thread");
        }


    }
}
