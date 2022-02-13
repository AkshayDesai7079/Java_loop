package com.CollectionsSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

class Demo{
    private int id;
    private String name;
    private String email;

    public Demo(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class LinkedListEmployee {
    public static void main(String[] args) {
        LinkedHashSet<Demo> linkedHashSet=new LinkedHashSet<Demo>();
        LinkedListEmployee employee=new LinkedListEmployee();
        employee.addMethod();

       // Demo demo=new Demo();


    }
    public Demo addMethod(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter a id");
        int id=scanner.nextInt();

        System.out.println("enter a name");
        String name=scanner.nextLine();

        System.out.println("enter a email");
        String email=scanner.nextLine();

        Demo demo=new Demo(id,name,email);

        return demo;


    }


}
