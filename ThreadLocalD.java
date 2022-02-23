package com.Thread;

class CustomerThread extends Thread{
    static Integer custId=0;
    private static ThreadLocal tl=new ThreadLocal() {

        protected Integer initialValue(){
            return ++custId;
        }
    };

    CustomerThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"execute customer id"+tl.get());
    }
}


public class ThreadLocalD {
    public static void main(String[] args) {
        CustomerThread cust1=new CustomerThread("Customer Thread 1");
        CustomerThread cust2=new CustomerThread("Customer Thread 2");
        CustomerThread cust3=new CustomerThread("Customer Thread 3");
        CustomerThread cust4=new CustomerThread("Customer Thread 4");

        cust1.start();
        cust2.start();
        cust3.start();
        cust4.start();
    }
}
