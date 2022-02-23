package com.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static com.Thread.ThreadUtil.EOF;

public class ThreadUtil {
    public static final String EOF="EOF";

    public static void main(String[] args) {
        List<String>buffer=new ArrayList<String>();
        ReentrantLock bufferlock=new ReentrantLock();
        MyPoducer poducer=new MyPoducer(buffer,ThreadColor.A_BLUE,bufferlock);
        MyConsumer consumer=new MyConsumer(buffer,ThreadColor.A_PURPLE,bufferlock);
        MyConsumer consumer1=new MyConsumer(buffer,ThreadColor.A_CYAN,bufferlock);

        new Thread(poducer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();

    }
}

class MyPoducer implements Runnable{
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyPoducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    public void run(){
        Random random=new Random();
        String[] nums={"1","2","3","4","5"};

        for (String num:nums){
            try {
                System.out.println(color+" Adding..."+num);
                bufferLock.lock();
               try {
                    buffer.add(num);
                }finally {
                   bufferLock.unlock();
               }

                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(color+"Adding EOF and existing");
        bufferLock.lock();
        try {
            buffer.add("EOF");
        }finally {
            bufferLock.unlock();
        }
    }
}

class MyConsumer implements Runnable{
    private List<String>buffer;
    private String color;
    private ReentrantLock bufferlock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferlock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferlock = bufferlock;
    }

    public void run(){
        int counter=0;

        while (true) {
            if(bufferlock.tryLock())
            try {
                if (buffer.isEmpty()) {
                    continue;
                }
                System.out.println(color+"The counter = "+counter);
                counter=0;

                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Existing");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            }finally {
                bufferlock.unlock();
            }else {
              counter++;
            }
        }
    }
}
