package com.Mapping;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"akshay");
        ht.put(102,"ajay");
        ht.put(103,"amit");
        ht.put(104,"om");
        //ht.put(null,"om");//null is not implemented in hashtable
        ht.put(101,"kkk");
        System.out.println(ht.values());

        for (Map.Entry mt:ht.entrySet()){
            System.out.println(mt.getKey()+" "+mt.getValue());
        }
        System.out.println("===========");
        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(101,"akshay");
        hm.put(102,"ajay");
        hm.put(103,"amit");
        hm.put(104,"om");

        System.out.println(hm.hashCode());


        System.out.println(hm);

        hm.put(105,"ajay");
        System.out.println(hm);

        for (Map.Entry mp:hm.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

        HashMap<Integer,Double> hm1=new HashMap<>();
        hm1.put(1,2.2);
        hm1.put(2,2.4);
        System.out.println(hm1.equals(hm));//returns the boolean result


        System.out.println(hm1.hashCode());// hashcode id of the object
    }
}
