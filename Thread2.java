package com.Thread;
class Mythread2  extends Thread{
    public void start(){
        System.out.println("start method");

    }
    public void run(int i){
        System.out.println("int arg method");
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Mythread2 myThread2=new Mythread2();
        myThread2.start();

    }
}
