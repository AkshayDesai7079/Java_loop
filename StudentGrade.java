package com.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Function<Student,String> f=s->{int marks=s.marks;
                                        String grade="";
                                        if(marks>=80) grade="A";
                                        else if(marks>=60) grade="B";
                                        else if(marks>=50) grade="C";
                                        else if(marks>=35) grade="D";
                                        else grade="Failed";
                                        return grade;
                                         };

        Student[] s={new Student("akshay",89), new Student("mayur",56),new Student("sagar",67),new Student("om",30)}  ;

        Predicate<Student> p=s1->s1.marks>=60;

        Consumer<Student> c=s1-> {
            System.out.println("Student name: "+s1.name);
            System.out.println("Student Marks: "+s1.marks);
            System.out.println("Student Grade: "+f.apply(s1));
            System.out.println();
        };

        for (Student s1:s){
            c.accept(s1);
        }

        /*

        for (Student s1:s) {
            if (p.test(s1)) {
                System.out.println("Student name: " + s1.name);
                System.out.println("Student Marks: " + s1.marks);
                System.out.println("Student Grade: " + f.apply(s1));
            }
        }

         */





    }
}
