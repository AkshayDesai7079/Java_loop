package com.Thread;

public class StravationDemo {
    private static Object lock=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(new Worker(ThreadColor.A_RED));
        Thread t2=new Thread(new Worker(ThreadColor.A_BLUE));
        Thread t3=new Thread(new Worker(ThreadColor.A_GREEN));
        Thread t4=new Thread(new Worker(ThreadColor.A_CYAN));
        Thread t5=new Thread(new Worker(ThreadColor.A_BLACK));

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t3.start();
        t2.start();
        t5.start();
        t4.start();
        t1.start();


    }

    private static class Worker implements Runnable{
        private int runCount=0;
        public String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }
        public void run(){
            for (int i=0;i<20;i++){
                synchronized (lock){
                    System.out.format(threadColor+"%s: runCount =%d\n",Thread.currentThread().getName(),runCount++);
                }
            }
        }
    }
}
