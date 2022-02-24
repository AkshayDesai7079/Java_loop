package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("akshay");
        l.add("praful");
        l.add("onkar");
        l.add("damon");
        l.add("krish");
        l.add("om");
        System.out.println(l);

        List<String>l2=l.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);

        List<String>l3=l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(l3);
    }
}
