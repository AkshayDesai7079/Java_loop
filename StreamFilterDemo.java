package com.Lambda;

import java.util.ArrayList;

public class StreamFilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(50);
        marks.add(67);
        marks.add(30);
        marks.add(35);
        marks.add(20);
        System.out.println(marks);
        long noOfFailedStud=marks.stream().filter(m->m>35).count();
        System.out.println(noOfFailedStud);


    }
}
