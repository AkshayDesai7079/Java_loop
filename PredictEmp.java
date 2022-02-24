package com.Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
    String name;
    int salary;

    public Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class PredictEmp {
    public static void main(String[] args) {
        ArrayList<Employee1> l=new ArrayList<>();

        l.add(new Employee1("akshay",2000));
        l.add(new Employee1("amit",4000));
        l.add(new Employee1("sagar",3000));
        l.add(new Employee1("ramesh",6000));

        Predicate<Employee1> p = e -> e.salary>3000;

        for (Employee1 e1:l){
            if (p.test(e1)){
                System.out.println(e1.name+" "+e1.salary);
            }
        }
    }
}
