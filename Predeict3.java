package com.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Emp{
    private String name;
    private int age;

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}


public class Predeict3 {
    public static void main(String[] args) {
        Emp a=new Emp("akshay",20);
        Emp b=new Emp("amit",24);
        Emp c=new Emp("raj",25);

        List<Emp>l=new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);

        printEmp(l,"Employee over 20",emp -> emp.getAge()>20);
        printEmp(l,"Employee 20 and under ",emp -> emp.getAge()<=20);


    }

    private static void printEmp(List<Emp> emp, String ageText, Predicate<Emp>ageCondition){
        System.out.println(ageText);
        System.out.println("=============");
        for (Emp emp1:emp){
            if (ageCondition.test(emp1)){
                System.out.println(emp1.getName());
            }
        }
    }

}
