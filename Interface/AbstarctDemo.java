package com.example;

public class AbstarctDemo {
    public static void main(String[] args) {
        Salary s=new Salary("akshay","panvel",101,7000.00);
        Employee e=new Salary("onkar","kamothe",102,6090.00);
        System.out.println("call mailcheck using salary refrence....");
        s.mailCheck();
        System.out.println("\n call mailcheck using employee reference ---");
        e.details();
        e.mailCheck();

    }
}
