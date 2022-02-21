package com.Thread;
class MyThread7 extends Thread{
    public void run(){
        try{
            for (int i=0;i<5;i++){
                System.out.println("I am lazy Thread"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("i got interrupted");
        }
    }
}

public class IntrruptDemo {

    public static void main(String[] args) {
        MyThread7 myThread7=new MyThread7();
        myThread7.start();
        myThread7.interrupt();


    }
}
