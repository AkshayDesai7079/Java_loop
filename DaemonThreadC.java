package com.Thread;

class Mthread implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("lazy thread");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class DaemonThreadC {
    public static void main(String[] args) {
        Mthread mthread=new Mthread();
        Thread m=new Thread(mthread);
        m.setDaemon(true);
        m.start();
        System.out.println(m.isDaemon());

        System.out.println("end of main thread");
    }
}
