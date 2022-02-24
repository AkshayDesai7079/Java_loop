package com.Lambda;

import java.util.Scanner;

interface Inter{
    public void m1(String name,int age);
}

public class LambdaInter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a name");
        String n= scanner.next();

        System.out.println("enter a age");
        int a=scanner.nextInt();


        Inter i=(name,age)-> System.out.println("the name is "+name+ " and his age is "+age);
        i.m1("akshay",23);
        i.m1("amit",26);
        i.m1("sumit",45);
        i.m1(n,a);
    }
}
