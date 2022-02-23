package com.Thread;

class ParentThread extends Thread{
    //public static InheritableThreadLocal tl=new InheritableThreadLocal();//the value of child thread is now value of parent thread
    public static InheritableThreadLocal tl=new InheritableThreadLocal(){//if you want to set the value of child thread then set the value by using this method
        public Object childValue(Object p){
            return "Child V";
        }
    };



    public void run(){
        tl.set("Parent v");
        System.out.println("parent value is "+tl.get());

        ChildThread cl=new ChildThread();
        cl.start();
    }
}

class ChildThread extends Thread{
    public void run(){
        System.out.println("child thread value is "+ParentThread.tl.get());
    }
}


public class ThreadLocal2 {
    public static void main(String[] args) {
        ParentThread parentThread=new ParentThread();
        parentThread.start();
    }
}
