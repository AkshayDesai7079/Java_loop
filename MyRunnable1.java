package com.Thread;

import static com.Thread.ThreadColor.A_RED;

public class MyRunnable1 implements Runnable{
    public void run(){
        System.out.println(A_RED+"hello from myrunnable implementation of run()");

    }
}
