package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String>l=new ArrayList<>();
        l.add("akshay");
        l.add("amit");
        l.add("anish");
        l.add("om");
        System.out.println(l);

        List<String>l2=l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);


        long count=l.stream().filter(a->a.length()==4).count();
        System.out.println(count);
    }
}
