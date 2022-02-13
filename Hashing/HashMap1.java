package com.CollectionsSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"akshay");
        hashMap.put(2,"ajay");
        hashMap.put(3,"amit");
        hashMap.put(4,"om");
        hashMap.put(5,"om");//duplicates key are not allowed but values are allowed

        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hashMap.putIfAbsent(6,"akk");
        hashMap.remove(3);
        hashMap.replace(4,"jitesh");

        hashMap.replaceAll((k,v)->"ajay");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        /*
        Iterator iterator=hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

         */
    }
}
