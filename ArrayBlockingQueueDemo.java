package com.Thread;

import java.util.Random;
import java.util.concurrent.*;


import static com.Thread.ThreadUtil.EOF;

public class ArrayBlockingQueueDemo {
    public static final String EOF="EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer=new ArrayBlockingQueue<String>(6);
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        MyPoducer1 poducer=new MyPoducer1(buffer,ThreadColor.A_BLUE);
        MyConsumer1 consumer=new MyConsumer1(buffer,ThreadColor.A_PURPLE);
        MyConsumer1 consumer1=new MyConsumer1(buffer,ThreadColor.A_CYAN);

        executorService.execute(poducer);
        executorService.execute(consumer);
        executorService.execute(consumer1);


        Future<String> future=executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.A_RED+"I am being printed for the Callable class");
                return "This is the callable result";
            }
        });
        try {
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("something went wrong");
        }catch (InterruptedException e){
            System.out.println("Thread running the task was interrupted");
        }
        executorService.shutdown();
    }
}

class MyPoducer1 implements Runnable{
    private ArrayBlockingQueue<String>buffer;
    private String color;


    public MyPoducer1(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run(){
        Random random=new Random();
        String[] nums={"1","2","3","4","5"};

        for (String num:nums){
            try {
                System.out.println(color+" Adding..."+num);
                    buffer.put(num);
                    Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(color+"Adding EOF and existing");

        try {
            buffer.put("EOF");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyConsumer1 implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;


    public MyConsumer1(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;

    }

    public void run() {


        while (true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }

                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Existing");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}


