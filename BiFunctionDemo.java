package com.Lambda;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee2{
    int id;
    String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class BiFunctionDemo {
    public static void main(String[] args) {
        ArrayList<Employee2>l=new ArrayList<>();

        BiFunction<Integer,String,Employee2> f=(id,name)->new Employee2(id,name);

        l.add(f.apply(101,"akshay"));
        l.add(f.apply(102,"ajay"));
        l.add(f.apply(103,"amit"));
        l.add(f.apply(104,"raj"));
        l.add(f.apply(105,"om"));

        for (Employee2 s:l){
            System.out.println("Emp no: "+s.id);
            System.out.println("Emp name: "+s.name);
        }

    }
}
