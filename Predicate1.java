package com.Lambda;

import java.io.PrintWriter;
import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        int[] x={1,2,5,16,7,3,23,45,6,33,23,78};

        Predicate<Integer> p1= i -> i%2==0;
        Predicate<Integer> p2=i -> i>10;

        System.out.println("the numbers which are even and > 10 are :");

        for (int x1:x){
            /*
            if (p1.and(p2).test(x1)){
                System.out.println(x1);// the result is number is even but greater than 10
            }
             */
            if (p1.negate().test(x1)){
                System.out.println(x1);//the result is not even number
            }
        }
    }
}
