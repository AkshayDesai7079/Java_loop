package org.excetions;

import dom.banking.User;

import java.util.NoSuchElementException;
import java.util.Scanner;

class user {
     private int id;
     private String name;
     private int age;

     public user(int id, String name, int age) throws Exception{
         this.id = id;
         this.name = name;

         if (age < 18) {
             throw new ArithmeticException("you are not elligible...");
         }
         this.age = age;


     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
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

     @Override
     public String toString() {
         return "user{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     public void display() {
         System.out.println("Id " + getId() + "Name " + getName() + "Age " + getAge());
     }
 }

public class CustomEx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a id");
        int id;
        try {
            id=scanner.nextInt();
        }
        catch (NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }catch (ArithmeticException e){
            throw new ArithmeticException("please enter a digit ");
        }


        System.out.println("enter a name");
        String name=scanner.next();

        System.out.println("enter a age");

        int age;
        try {
            age=scanner.nextInt();
        }catch (NoSuchElementException e){
            throw new  ArithmeticException("please enter a valid input");
        }

        user user1= null;
        try {
            user1 = new user(id,name,age);
            user1.display();
        } catch (Exception e) {
            //System.out.println(e);//only display the which type of error is come
            throw new  ArithmeticException("please enter elligible age value ");
            //e.printStackTrace();//print the error type means exception name and also print the msg and which no of line you have come error
        }

    }
}


