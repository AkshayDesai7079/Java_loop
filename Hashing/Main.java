package com.CollectionsSet;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,HashMapEmp> hashMap=new HashMap<>();

        HashMapEmp hashMapEmp=new HashMapEmp(1,"akshay","a@jnj");
        HashMapEmp hashMapEmp1=new HashMapEmp(2,"ajay","hbbh@jn");
        HashMapEmp hashMapEmp2=new HashMapEmp(3,"hbs","jnsn@nj");


        hashMap.put(1,hashMapEmp);
        hashMap.put(2,hashMapEmp1);
        hashMap.put(3,hashMapEmp2);

        for (HashMap.Entry<Integer,HashMapEmp>empEntry:hashMap.entrySet()){
            int key=empEntry.getKey();
            HashMapEmp hashMapEmp3=empEntry.getValue();
            System.out.println(key+"Details");
            System.out.println(hashMapEmp3.id+" "+hashMapEmp3.name+" "+hashMapEmp3.email);
        }
    }
}
