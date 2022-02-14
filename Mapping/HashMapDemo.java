package com.Mapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"akshay");
        hashMap.put(2,"ajay");
        hashMap.put(3,"amit");
        hashMap.put(4,"nehal");
        System.out.println(hashMap);
        hashMap.put(3,"daksh"); //trying duplicates keys





     for (Map.Entry map:hashMap.entrySet()){
         System.out.println(map.getKey()+" "+map.getValue());
     }

     hashMap.putIfAbsent(6,"gourav");

     for (Map.Entry map:hashMap.entrySet()){
         System.out.println(map.getKey()+" "+map.getValue());
     }

     HashMap<Integer,String> hash=new HashMap<>();
     hash.put(7,"aaaa");

     hash.putAll(hashMap);//converting all the elements of one object to another object

     for (Map.Entry map:hash.entrySet()){
         System.out.println(map.getKey()+" "+map.getValue());
     }

     hash.remove(1);
    hash.replace(2,"ajay","akshay");

     for (Map.Entry map:hash.entrySet()){
         System.out.println(map.getKey()+" "+map.getValue());
     }
    }
}
