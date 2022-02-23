package com.Thread;
class MyT extends Thread{
    ThreadGroup g;
    String name;

    public MyT(ThreadGroup g, String name) {
        this.g = g;
        this.name = name;
    }
    public void run(){
        System.out.println("Child thread");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


public class ThreadGroupDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup g=new ThreadGroup("Parent Group");
        ThreadGroup g1=new ThreadGroup(g,"Child Group");
        MyT t1=new MyT(g,"Child thread 1");
        MyT t2=new MyT(g,"Child Thread 2");
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(4);

        System.out.println(Thread.currentThread().getPriority());

        System.out.println(g.activeCount());
        System.out.println(g.activeGroupCount());

        g.list();
        Thread.sleep(5000);
        System.out.println(g.activeCount());
        g.list();
    }
}
