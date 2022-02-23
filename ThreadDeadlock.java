package com.Thread;

public class ThreadDeadlock {
    public static void main(String[] args) {
        final PolitePerson akshay=new PolitePerson("akshay");
        final PolitePerson amit=new PolitePerson("amit");

        new Thread(new Runnable() {
            @Override
            public void run() {
                akshay.sayHello(amit);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                amit.sayHello(akshay);
            }
        }).start();


    }
    static class PolitePerson{
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person){
            System.out.format("%s: %s"+"has said hello to me!!!! %n",this.name,person.getName());
            person.sayHello(this);
        }
        public synchronized void sayHelloBack(PolitePerson person){
            System.out.format("%s: %s"+"has said hello to me!!!! %n",this.name,person.getName());
        }

    }


}


