package com.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud2 implements Serializable{
    public String name;
    public int id;
    public int age;

    public Stud2(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

}

public class ObjectoutputStreamC {
    public static void main(String[] args) {
        Stud2 stud2=new Stud2("akshay",1,21);
        Stud2 stud3=new Stud2("ajay",2,22);

        try{
            FileOutputStream file=new FileOutputStream("this.txt");
            ObjectOutputStream ovj=new ObjectOutputStream(file);
            ovj.writeObject(stud2);
            ovj.writeObject(stud3);
            ovj.close();
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
