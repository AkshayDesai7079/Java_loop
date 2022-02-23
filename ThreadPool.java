package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadpoolD implements Runnable{
    String name;

    public ThreadpoolD(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name+"..thread started "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name+"...completed"+Thread.currentThread().getName());
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        ThreadpoolD[] threadpoolDS={new ThreadpoolD("akshay"),
                                    new ThreadpoolD("amit"),
                                    new ThreadpoolD("dipak"),
                                    new ThreadpoolD("sam"),
                                    new ThreadpoolD("nikesh")}       ;

        ExecutorService service=Executors.newFixedThreadPool(5);
        for (ThreadpoolD jobs:threadpoolDS){
            service.submit(jobs);
        }
        System.out.println(Thread.currentThread().getName());

    }
}
