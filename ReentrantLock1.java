package com.Thread;

import java.util.concurrent.locks.ReentrantLock;

class Display1{
    ReentrantLock l=new ReentrantLock();
    public void wish(String name){
        l.lock();//-----1
        for (int i=0;i<10;i++){
            System.out.println("Good morning ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name);
        }
        l.unlock();//----2
    }
}
class Mt extends Thread{
    Display1 d;
    String name;

    public Mt(Display1 d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}


public class ReentrantLock1 {
    public static void main(String[] args) {
        Display1 d=new Display1();
        Mt t1=new Mt(d,"akshay");
        Mt t2=new Mt(d,"amit");
        Mt t3=new Mt(d,"nilesh");

        t1.start();
        t2.start();
        t3.start();
    }
}
