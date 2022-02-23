package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;

    public PrintJob(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name+"...job started by Thread"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name+" job completed by Thread"+Thread.currentThread().getName());
    }
}




public class ThreadPoolC {
    public static void main(String[] args) {
        PrintJob[]jobs={new PrintJob("akshay"),new PrintJob("onkar"),new PrintJob("anil"),new PrintJob("suresh"),new PrintJob("raju")};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for (PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
