package com.Lambda;

interface Interf{
    public void m1();
}

public class Lambda1 {
    int x=10;

    public void m2(){
        int y=20;

        Interf i=() -> {
            System.out.println(x);
            System.out.println(y);

            x=100;
            System.out.println(x);

           // y=200;
          //  System.out.println(y); //C.E--- local variables referenced from a lambda expression must be final or effectively final
        };
        i.m1();
    }

    public static void main(String[] args) {
        Lambda1 lambda1=new Lambda1();
        lambda1.m2();
    }

}
