package com.Thread;

import java.util.Random;

public class NotifyAllC {
    public static void main(String[] args) {
        Message message=new Message();
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}
class Message{
    private String message;
    private boolean empty=true;

    public synchronized String read(){
        while (empty){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        empty=true;
        notifyAll();
        return message;

    }

    public synchronized void write(String message){
        while (!empty){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        empty=false;
        this.message=message;
        notifyAll();

    }

}
class Writer implements Runnable{
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run(){
        String messages[]={
                "akshay desai",
                "onkar maske",
                "krutik mandre"
        };

        Random random = new Random();

        for (int i=0;i<messages.length;i++){
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run(){
        Random random=new Random();
        for (String late=message.read();!late.equals("Finished");late=message.read()){
            System.out.println(late);
            try {
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}