package com.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamC {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream("this.txt");
            ObjectInputStream out=new ObjectInputStream(file);

            Stud2 stud2=(Stud2) out.readObject();
            Stud2 stud3=(Stud2)out.readObject();

            System.out.println("Student Name "+stud2.name);
            System.out.println("Student id "+stud2.id);
            System.out.println("Student age "+stud2.age);

            System.out.println("Student Name "+stud3.name);
            System.out.println("Student id "+stud3.id);
            System.out.println("Student age "+stud3.age);


        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
