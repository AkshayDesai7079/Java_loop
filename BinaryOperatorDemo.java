package com.Lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<String> b=(s1,s2)->s1+s2;
        System.out.println(b.apply("akshay","desai"));
    }
}
