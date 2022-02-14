package com.Mapping;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer I1=(Integer) obj1;
        Integer I2=(Integer) obj2;

      return I1.compareTo(I2); // Insertion order


    // return I2.compareTo(I1); // Reversed order




/*
        if(I1<I2){
            return 1;

        }
        else if(I1>I2){
            return -1;

        }
        else {
            return 0;
        }


 */

    }




}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet k=new TreeSet<>(new MyComparator());

        k.add(4);
        k.add(2);
        k.add(5);
        k.add(1);
        k.add(3);




        System.out.println(k);

    }
}
