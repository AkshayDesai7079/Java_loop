package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}


public class EmployeeData {
    public static void main(String[] args) {
        ArrayList<Employee>l=new ArrayList<>();

        l.add(new Employee("akshay",1,2000));
        l.add(new Employee("suraj",6,3000));
        l.add(new Employee("amit",3,3000));
        l.add(new Employee("nayan",2,5000));

        Collections.sort(l,(i1,i2)->(i1.id<i2.id)?-1:(i1.id>i2.id)?1:0);//sort the list using lambda expression
        System.out.println(l);


        Collections.sort(l,(i1,i2)->i1.name.compareTo(i2.name));//sorting the list in alphabetical order
        System.out.println(l);
    }
}
