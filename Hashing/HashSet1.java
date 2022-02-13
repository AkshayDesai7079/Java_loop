package com.CollectionsSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();

        hashSet.add("akshay");
        hashSet.add("ajay");
        hashSet.add("raj");
        hashSet.add("amit");
        hashSet.add("sam");


        System.out.println(hashSet.size());

        System.out.println(hashSet.isEmpty());//boolean result

        System.out.println(hashSet.remove("raj"));

        System.out.println(hashSet.contains("akshay"));//boolean result

        hashSet.add("akshay");//hashset do not get the duplicates elements because in hashset we only add unique elements

        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ArrayList arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);

        System.out.println(arrayList);//arraylist contains duplicates elements

        HashSet hashSet1=new HashSet(arrayList);

        System.out.println(hashSet1);//hashset do not get the duplicates elements


    }

}
