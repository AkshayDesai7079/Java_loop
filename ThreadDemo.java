package com.Thread;

class MyThread3 extends Thread{

}

public class ThreadDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread3 myThread3=new MyThread3();
        System.out.println(myThread3.getName());
        Thread.currentThread().setName("akshay");
        System.out.println(Thread.currentThread().getName());
    }
}
