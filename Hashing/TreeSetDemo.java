package com.CollectionsSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();

        //treeset are
        treeSet.add("akshay");
        treeSet.add("ajay");
        treeSet.add("sam");
        treeSet.add("zore");
        treeSet.add("ram");
        treeSet.add("amit");
        treeSet.add("om");



        //System.out.println(treeSet);

      //  Iterator iterator=treeSet.iterator();
      //  while (iterator.hasNext()){
      //    System.out.println(iterator.next());
      //  }

        System.out.println("Highest string "+treeSet.pollFirst());
        System.out.println("Lowest string "+treeSet.pollLast());
        System.out.println("Tree set "+treeSet);
        System.out.println("Head set "+treeSet.headSet("ram",false));
        System.out.println("Sub set "+treeSet.subSet("akshay",true,"sam",false));
        System.out.println("tail set"+treeSet.tailSet("ram",false));



        //reverse the order
        Iterator iterator=treeSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
