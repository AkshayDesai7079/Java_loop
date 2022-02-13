package com.CollectionsSet;


import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();

        for (int i=0;i<=10;i++){
            priorityQueue.offer(i);
        }

        System.out.println(priorityQueue);

        priorityQueue.poll();//remove first element in the queue
        System.out.println(priorityQueue);

        priorityQueue.peek();
        System.out.println(priorityQueue);

        priorityQueue.element();
        System.out.println(priorityQueue);

    }


}
