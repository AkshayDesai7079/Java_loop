package com.Thread;

class Countdowm{
    private int i;
    //we can also do this method is synchronized by using synchronized keyword
    //public synchronized void doCountdown
    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.A_CYAN;
                break;

            case "Thread 2":
                color = ThreadColor.A_PURPLE;
                break;

            default:
                color = ThreadColor.A_GREEN;

        }

            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i" + i);
            }

    }
}

class CountdownThread extends Thread{
    private Countdowm threadCountdown;

    public CountdownThread(Countdowm threadCountdown) {
        this.threadCountdown = threadCountdown;
    }
    public void run(){
        threadCountdown.doCountdown();
    }
}


public class Threadmain {
    public static void main(String[] args) throws InterruptedException {
        Countdowm countdowm=new Countdowm();

        CountdownThread c1=new CountdownThread(countdowm);
        c1.setName("Thread 1");



        CountdownThread c2=new CountdownThread(countdowm);
        c2.setName("Thread 2");


        c1.start();

        c2.start();
    }

}
