package com.Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThreadL extends Thread{
    static ReentrantLock l=new ReentrantLock();

    MyThreadL(String name){
        super(name);
    }
    public void run(){
        do {
            try {
                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "got lock ");
                    Thread.sleep(10000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + "release lock");
                    break;
                }

                else {
                    System.out.println(Thread.currentThread().getName()+"..unable to get lock and hence performing alternative operations");

                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        while (true);
    }
}



public class ReentrantLock3 {
    public static void main(String[] args) {
        MyThreadL t1=new MyThreadL("First");
        MyThreadL t2=new MyThreadL("Second");
        t1.start();
        t2.start();
    }



}
