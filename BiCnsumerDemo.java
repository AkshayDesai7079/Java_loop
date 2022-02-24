package com.Lambda;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee3{
    String name;
    double salary;

    public Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class BiCnsumerDemo {
    public static void main(String[] args) {
        ArrayList<Employee3>l=new ArrayList<>();
        populate(l);

        BiConsumer<Employee3,Double> c=(e,d)->e.salary=e.salary+d;
        for (Employee3 e:l){
            c.accept(e,500.00);
        }
        for (Employee3 e:l){
            System.out.println("Employee Name: "+e.name);
            System.out.println("Employee Salary: "+e.salary);
        }

    }
    public static void populate(ArrayList<Employee3>l){
        l.add(new Employee3("akshay",1000));
        l.add(new Employee3("ajay",2000));
        l.add(new Employee3("om",3000));
        l.add(new Employee3("sam",4000));
    }
}
