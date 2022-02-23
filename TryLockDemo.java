package com.Thread;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadD extends Thread{
    static ReentrantLock l=new ReentrantLock();

    MyThreadD(String name){
        super(name);
    }
    public void run(){
        if (l.tryLock()){
            System.out.println(Thread.currentThread().getName()+"got lock and performing operation");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            l.unlock();
        }
        else {
            System.out.println(Thread.currentThread().getName()+"..unable to get lock and hence performing alternative operations");

        }
    }
}

public class TryLockDemo {
    public static void main(String[] args) {
        MyThreadD t1=new MyThreadD("First Thread");
        MyThreadD t2=new MyThreadD("Second Thread");
        t1.start();
        t2.start();
    }

}
