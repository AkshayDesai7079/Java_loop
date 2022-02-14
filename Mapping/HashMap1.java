package com.Mapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();

        hashMap.put("akshay",1);
        hashMap.put("ajay",2);
        hashMap.put("kkk",3);
        hashMap.put("dwed",4);

        System.out.println(hashMap);
        hashMap.put("akshay",5);
        System.out.println(hashMap);

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        Set s=hashMap.entrySet();
        System.out.println(s);

        Iterator iterator=s.iterator();
        while (iterator.hasNext()){
            Map.Entry m1=(Map.Entry)iterator.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if (m1.getKey().equals("kkk")){
                m1.setValue(1000);
            }
        }
        System.out.println(hashMap);

    }
}
