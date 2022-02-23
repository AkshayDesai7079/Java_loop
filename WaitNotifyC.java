package com.Thread;

class MythreadN extends Thread{
    int total=0;

    public void run(){
        synchronized (this){
            System.out.println("child thread starts calculation");
            for (int i=0;i<=100;i++){
                total=total+i;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("child thread giving notification call");
            this.notify();
        }
    }

}
public class WaitNotifyC {
    public static void main(String[] args) throws InterruptedException {
        MythreadN mythreadN=new MythreadN();
        mythreadN.start();
        synchronized (mythreadN){
            System.out.println("main thread calling wait() method");
            mythreadN.wait();
            System.out.println("main thread got notification call");
            System.out.println(mythreadN.total);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
