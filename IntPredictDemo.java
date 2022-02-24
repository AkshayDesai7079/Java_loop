package com.Lambda;

import java.util.function.IntPredicate;

public class IntPredictDemo {
    public static void main(String[] args) {
        int[] a={10,23,36,48,58,69,97,68};
        IntPredicate p=i->i%2==0;
        for (int x1:a){
            System.out.println(x1);
        }
    }
}
