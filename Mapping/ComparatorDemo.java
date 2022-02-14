package com.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Stud{
    int rollno;
    String name;
    int age;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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

    Stud(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;


    }
}

class Age implements Comparator<Stud>{
    public int compare(Stud obj1,Stud obj2){
        Stud s1=(Stud) obj1;
        Stud s2=(Stud) obj2;

        if (s1.age==s2.age){
            return 0;
        }
        else if(s1.age>s2.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}

class NameCompartor implements Comparator<Stud>{
    public int compare(Stud obj1,Stud obj2){
        Stud s1=(Stud) obj1;
        Stud s2=(Stud) obj2;

        return s1.name.compareTo(s1.name);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Stud> arrayList=new ArrayList<>();
        arrayList.add(new Stud(101,"akshay",23));
        arrayList.add(new Stud(108,"om",34));
        arrayList.add(new Stud(105,"jai",22));


        System.out.println("sorting by names");

        Collections.sort(arrayList,new NameCompartor());
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Stud st=(Stud)iterator.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("=========");

        Collections.sort(arrayList,new Age());
        Iterator iterator1=arrayList.iterator();
        while (iterator1.hasNext()){
            Stud st=(Stud)iterator1.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
    }

        Comparator<Stud>cm1=Comparator.comparing(Stud::getName);

        Collections.sort(arrayList,cm1);
        System.out.println("sorting by name");
        for (Stud st:arrayList){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("=========");

        Comparator<Stud>cm2=Comparator.comparing(Stud::getAge);
        Collections.sort(arrayList,cm2);
        System.out.println("sorting by age");
        for (Stud st:arrayList){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


}
}

