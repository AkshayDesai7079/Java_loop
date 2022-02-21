package com.Thread;
class MyThread6 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("child Thread");

            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}

public class JoinC {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 myThread6=new MyThread6();
        myThread6.start();
        myThread6.join(1000,100);
        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }

        System.out.println("A");
        Thread.sleep(1000);
        System.out.println("B");
        Thread.sleep(1000);
        System.out.println("C");
        Thread.sleep(1000);
        System.out.println("D");
        Thread.sleep(1000);
    }

}
