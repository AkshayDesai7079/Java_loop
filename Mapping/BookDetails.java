package com.Mapping;

import dom.banking.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookDetails {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        HashMap<Integer,Book>hashMap=new HashMap<>();

        Book book=new Book(101,"Data Stucture","Lipschute","McGraw",4);
        Book book1=new Book(102,"Dos Guide","NORTRON","PHI",5);
        Book book2=new Book(102,"COBOL","Sterm","John W",4);


        System.out.println("enter a id");
        int id=scanner.nextInt();

        System.out.println("enter a book name");
        String name=scanner.next();

        System.out.println("enter a author name");
        String author=scanner.next();

        System.out.println("enter a publisher name");
        String publisher=scanner.next();

        System.out.println("enter a quantity");
        int quantity=scanner.nextInt();

        Book book3=new Book(id,name,author,publisher,quantity);

        hashMap.put(1,book);
        hashMap.put(2,book1);
        hashMap.put(3,book2);
        hashMap.put(4,book3);

        for (Map.Entry<Integer,Book> map:hashMap.entrySet()){
            int key=map.getKey();
            Book value=map.getValue();
            System.out.println(key+"Details");
            System.out.println(value.getId()+" "+value.getName()+" "+value.getAuthor()+" "+value.getPublisher()+" "+value.getQuantiy());
        }


    }

}
