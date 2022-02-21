package com.Thread;

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread my=new MyThread();//Instantiation of a thread
        my.start();//starting of thread
        //my.start();//we cannot call the method again then complier gives error

        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
