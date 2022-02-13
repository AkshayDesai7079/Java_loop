package com.keyword;

public class StaticCounter {
    public static int price=0;
    public String name;

    public StaticCounter(String name) {
        this.name = name;
        price++;
    }
    public void display(){
        System.out.println(name+" "+price);
    }

    public static void main(String[] args) {
        StaticCounter staticCounter=new StaticCounter("akshay");
        staticCounter.display();
        StaticCounter staticCounter1=new StaticCounter("ajay");
        staticCounter.display();

    }
}
