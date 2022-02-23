package com.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2{
    public static void main(String[] args) {
        ReentrantLock l=new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println(l.isLocked());
        System.out.println(l.isHeldByCurrentThread());
        System.out.println(l.getQueueLength());
        System.out.println(l.isFair());
        l.unlock();
        System.out.println(l.getHoldCount());
        System.out.println(l.isFair());
        l.unlock();
        System.out.println(l.getHoldCount());
    }

}
