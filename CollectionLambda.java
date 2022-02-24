package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
class MyComparator implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if (i1>i2){
            return -1;
        }
        else if (i1<i2){
            return 1;
        }else {
            return 0;
        }
    }
}

 */

public class CollectionLambda {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(45);
        l.add(78);
        l.add(90);
        l.add(65);
        l.add(34);

        System.out.println(l);

        Comparator<Integer> c =(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);

        l.stream().forEach(System.out::println);//iterator the list

        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());//even numbers in a list
        System.out.println(l2);


    }
}
