package com.Thread;

class Display{
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good morning "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(name);
            }
        }
    }
    public synchronized void demo(int number){
        for (int i=0;i<5;i++){
            System.out.println("number"+number);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


class MyThread11 extends Thread{
    Display d;
    String name;
    int number;

    public MyThread11(Display d, String name,int number) {
        this.d = d;
        this.name = name;
        this.number=number;
    }
    public void run(){
        d.wish(name);
        d.demo(number);
    }
}


public class SyncronizedDemo{
    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();

        MyThread11 myThread11=new MyThread11(d1,"akshay",20);
        MyThread11 myThread111=new MyThread11(d2,"onkar",40);

        myThread11.start();
        myThread111.start();


    }

}


