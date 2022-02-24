package com.Lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] s={"akshay","amit","jitesh","sam","rahul"};

        Predicate<String> p1=s1 -> s1.length()>3;

        for (String s1:s){
            if (p1.test(s1)){
                System.out.println(s1);//getting the result of character greater than 3
            }
        }

    }
}
