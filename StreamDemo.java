package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        for (int i=0;i<10;i++){
            l1.add(i);
        }
        System.out.println(l1);

        List<Integer>l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        /*
        for (Integer i:l1){
            if(i%2==0){
                l2.add(i);
            }
        }

         */
        System.out.println(l2);



    }
}
