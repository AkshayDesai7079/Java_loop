package com.Thread;


class MyThread4 extends Thread{
    public void run(){

        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class ThreadProrityDemo {
    public static void main(String[] args) {
        MyThread4 myThread4=new MyThread4();
        //myThread4.setPriority(10);
        myThread4.start();

        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
